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

      //get the cent amount from the form and change it to an integer
      String stringUserInput = request.queryParams("userInput");
      Integer intUserInput = Integer.parseInt(stringUserInput);

      //output the change to the page
      String outPut = createChange(intUserInput);
      model.put("outPut", outPut);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

   public static String createChange (Integer intUserInput) {

  Integer quarters = 0;
  Integer dimes = 0;
  Integer nickels = 0;
  Integer pennies = 0;

  while ( intUserInput > 0 )
  {

    if ( intUserInput >= 25)
    {
      intUserInput -= 25;
      quarters = quarters+=1;
    }
    else{ //code doesn't know how to do this yet!!
      break;
    }

  }

String  returnText= "You have used: " + quarters;

  return returnText;
  }

}
