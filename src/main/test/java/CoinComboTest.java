import org.junit.*;
import static org.junit.Assert.*;

public class CoinComboTest {

  @Test
  public void InputStringConvertedToInteger_istrue() {
    testCoinCombo = new coinCombo();
    String userInput = "5";
    assertEquals(true, testCoinCombo.isInteger(5));
  }
}
