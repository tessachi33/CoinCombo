import org.junit.*;
import static org.junit.Assert.*;

public class CoinComboTest {

  @Test
  public void InputStringConvertedToInteger_istrue() {
    testCoinCombo = new coinCombo();
    String userInput = "5";
    assertEquals(true, testCoinCombo.isInteger(5));
  }

  @Test
  public void InputStringHasCorrectOutput_istrue() { //maybe come back to this?
    testCoinCombo = new coinCombo();
    String testInput = "5";
    String testText = "You have used 0 quarter(s), 0 dime(s), 5 nickel(s), and 0 penny/pennies. Enjoy!";
    assertEquals(true, testCoinCombo.isText(testText));
  }
}
