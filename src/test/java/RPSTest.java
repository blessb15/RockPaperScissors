
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {
  @Test
  public void isRPS_checkForPaper_True() {
    RPS testRPS = new RPS();
    Boolean expected = true;

    assertEquals(expected, testRPS.isRPS("Paper"));
  }

  @Test
  public void isRPS_checkForRock_True() {
    RPS testRPS = new RPS();
    Boolean expected = true;

    assertEquals(expected, testRPS.isRPS("Rock"));
  }

  @Test
  public void isRPS_checkForScissors_True() {
    RPS testRPS = new RPS();
    Boolean expected = true;

    assertEquals(expected, testRPS.isRPS("Scissors"));
  }

}
