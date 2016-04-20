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

      model.put("isRPS", isRPS);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
}



    public static String isRPS(String symbol) {
      Random cpuRandom = new Random();
      String[] cpuSymbols = {"Rock", "Paper", "Scissors"};
      String[] playerSymbols = {"Rock", "Paper", "Scissors"};
      Integer num = cpuRandom.nextInt(cpuSymbols.length);
      String cpuString = cpuSymbols[num].toString();
      String message = "";
        // if (symbol == cpuSymbols[num]) {
        //   message = "tie";
        // } else
        if (symbol == "Rock" && cpuString == "Paper"){
          message = "cpu wins";
        } else if (symbol == "Rock" && cpuString == "Scissors"){
          message = "player wins";
        } else if (symbol == "Paper" && cpuString == "Rock"){
          message = "player wins";
        } else if (symbol == "Paper" && cpuString == "Scissors"){
          message = "cpu wins";
        } else if (symbol == "Scissors" && cpuString == "Rock"){
          message = "cpu wins";
        } else if (symbol == "Scissors" && cpuString == "Paper"){
          message = "player wins";
        } else {
          message = "tie";
        }
        return message;

      //   if (symbol == playerSymbols[2]) {
      //     return true;
      //     .add("you tie")
      //   } else if (symbol == "Rock" && playerSymbol == "Paper"){
      //     return false;
      //     .add("you lose")
      // }
  }
}
