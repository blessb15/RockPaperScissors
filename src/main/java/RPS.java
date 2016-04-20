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

    get("/onePlayer", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/onePlayer.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String input = request.queryParams("input");
      String input2 = request.queryParams("input2");
      RPS newGame = new RPS();
      String winner = newGame.isRPS(input1,input2);

      model.put("input", input);
      model.put("input2", input2);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/twoPlayer", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/twoPlayer.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector2", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector2.vtl");

      String input = request.queryParams("input");
      String input2 = request.queryParams("input2");
      String isRPS = isRPS(input);
      String isRPS2 = isRPS(input2);

      model.put("input", isRPS);
      model.put("input2", isRPS2);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
}
  public static String Comp(){
    Random cpuRandom = new Random();
    String[] cpuSymbols = {"Rock", "Paper", "Scissors"};
    Integer num = cpuRandom.nextInt(cpuSymbols.length);
    String cpuString = cpuSymbols[num].toString();
}
  public static String isRPS(String input, String input2){
    // String[] playerOneSymbols = {"Rock", "Paper", "Scissors"};
    // String[] playerTwoSymbols = {"Rock", "Paper", "Scissors"};
  String message = "";
  if (input.equals("Rock") && input2.equals("Paper")){
    message = "Player 2 wins";
  } else if (input.equals("Rock") && input2.equals("Scissors")){
    message = "Player 1 wins";
  } else if (input.equals("Paper") && input2.equals("Rock")){
    message = "Player 1 wins";
  } else if (input.equals("Paper") && input2.equals("Scissors")){
    message = "Player 2 wins";
  } else if (input.equals("Scissors") && input2.equals("Rock")){
    message = "PLayer 2 wins";
  } else if (input.equals("Scissors") && input2.equals("Paper")){
    message = "Player 1 wins";
  } else if (input.equals(input2)){
    message = "Tie";
  }
return message;
}


// public static String isRPS(String input) {
//   Random cpuRandom = new Random();
//   String[] cpuSymbols = {"Rock", "Paper", "Scissors"};
//   String[] playerSymbols = {"Rock", "Paper", "Scissors"};
//   Integer num = cpuRandom.nextInt(cpuSymbols.length);
//   String cpuString = cpuSymbols[num].toString();
//   String message = "";
//
//     if (input.equals("Rock") && cpuString.equals("Paper")){
//       message = "CPU wins";
//     } else if (input.equals("Rock") && cpuString.equals("Scissors")){
//       message = "Player wins";
//     } else if (input.equals("Paper") && cpuString.equals("Rock")){
//       message = "Player wins";
//     } else if (input.equals("Paper") && cpuString.equals("Scissors")){
//       message = "CPU wins";
//     } else if (input.equals("Scissors") && cpuString.equals("Rock")){
//       message = "CPU wins";
//     } else if (input.equals("Scissors") && cpuString.equals("Paper")){
//       message = "Player wins";
//     } else if (input.equals(cpuString)){
//       message = "Tie";
//     }
// return message;
// }
//
//   public static String isRPS(String input, String input2){
//     String[] playerOneSymbols = {"Rock", "Paper", "Scissors"};
//     String[] playerTwoSymbols = {"Rock", "Paper", "Scissors"};
//     String message = "";
//       if (input.equals("Rock") && input2.equals("Paper")){
//         message = "Player 2 wins";
//       } else if (input.equals("Rock") && input2.equals("Scissors")){
//         message = "Player 1 wins";
//       } else if (input.equals("Paper") && input2.equals("Rock")){
//         message = "Player 1 wins";
//       } else if (input.equals("Paper") && input2.equals("Scissors")){
//         message = "Player 2 wins";
//       } else if (input.equals("Scissors") && input2.equals("Rock")){
//         message = "PLayer 2 wins";
//       } else if (input.equals("Scissors") && input2.equals("Paper")){
//         message = "Player 1 wins";
//       } else if (input.equals(input2)){
//         message = "Tie";
//       }
// return message;
// }
//
}
