import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class RPS {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String input = request.queryParams("input");
      String isRPS = isRPS(input);

      model.put("input", isRPS);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
}




    public static String isRPS(String input) {
      Random cpuRandom = new Random();
      String[] cpuSymbols = {"Rock", "Paper", "Scissors"};
      String[] playerSymbols = {"Rock", "Paper", "Scissors"};
      Integer num = cpuRandom.nextInt(cpuSymbols.length);
      String cpuString = cpuSymbols[num].toString();
      String message = "";
        if (input.equals("Rock") && cpuString.equals("Paper")){
          message = "cpu wins";
        } else if (input.equals("Rock") && cpuString.equals("Scissors")){
          message = "player wins";
        } else if (input.equals("Paper") && cpuString.equals("Rock")){
          message = "player wins";
        } else if (input.equals("Paper") && cpuString.equals("Scissors")){
          message = "cpu wins";
        } else if (input.equals("Scissors") && cpuString.equals("Rock")){
          message = "cpu wins";
        } else if (input.equals("Scissors") && cpuString.equals("Paper")){
          message = "player wins";
        } else if (input.equals(cpuString)){
          message = "tie";
        }
      //   if (symbol == playerSymbols[2]) {
      //     return true;
      //     .add("you tie")
      //   } else if (symbol == "Rock" && playerSymbol == "Paper"){
      //     return false;
      //     .add("you lose")
      // }
  return message;
  }

}
