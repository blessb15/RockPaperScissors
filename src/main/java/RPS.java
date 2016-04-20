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






}



    public static Boolean isRPS(String symbol) {
      Random cpuRandom = new Random();
      String[] cpusymbols = {"Rock", "Paper", "Scissors"};
      Integer num = cpuRandom.nextInt(cpusymbols.length);
      String cpuSymbol = cpusymbols[num];

      if (symbol == cpusymbols[num]){
        return true;

      }else{
        return false;
        }
      }
    }
