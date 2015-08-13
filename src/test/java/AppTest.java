import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void rootTest() {
        goTo("http://localhost:4567/");
        assertThat(pageSource()).contains("Coin Combo"); //<--change this text later
}
    @Test
    public void outputTest() {
        goTo("http://localhost:4567/");
        fill("#userInput").with("5");
        submit(".btn");
        assertThat(pageSource()).contains("You have used 0 quarter(s), 0 dime(s), 1 nickel(s), and 0 penny/pennies. Enjoy!"); //<--change this text later
    }

}
