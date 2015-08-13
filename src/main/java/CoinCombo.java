import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.*;

public class CoinCombo {
  public static void main(String[] args){
    String layout = "templates/layout.vtl";

    // set up input page
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/input.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, response) -> {
      //set up the hashmap and set the output
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/output.vtl");

      //get the cent amount from the form
      String stringUserInput = request.queryParams("userInput");
      Integer intUserInput = Integer.parseInt(stringUserInput);

      //output the change to the page
      model.put("intUserInput", intUserInput);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  // public static createChange () {
  //
  // }

}
