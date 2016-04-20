import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {
  // @Test
  // public void isRPS_checkCpuForPaper_True() {
  //   RPS testRPS = new RPS();
  //   Boolean expected = true;
  //
  //   assertEquals(expected, testRPS.isRPS("Paper"));
  // }
  //
  // @Test
  // public void isRPS_checkCpuForRock_True() {
  //   RPS testRPS = new RPS();
  //   Boolean expected = true;
  //
  //   assertEquals(expected, testRPS.isRPS("Rock"));
  // }
  //
  // @Test
  // public void isRPS_checkCpuForScissors_True() {
  //   RPS testRPS = new RPS();
  //   Boolean expected = true;
  //
  //   assertEquals(expected, testRPS.isRPS("Scissors"));
  // }

  // @Test
  // public void isRPS_checkPlayerForPaper_True() {
  //   RPS testRPS = new RPS();
  //   Boolean expected = true;
  //
  //   assertEquals(expected, testRPS.isRPS("Paper"));
  // }
  //
  // @Test
  // public void isRPS_checkPlayerForRock_True() {
  //   RPS testRPS = new RPS();
  //   Boolean expected = true;
  //
  //   assertEquals(expected, testRPS.isRPS("Rock"));
  // }
  //
  // @Test
  // public void isRPS_checkPlayerForScissors_True() {
  //   RPS testRPS = new RPS();
  //   Boolean expected = true;
  //
  //   assertEquals(expected, testRPS.isRPS("Scissors"));
  // }
  @Test
  public void isRPS_isMessageShowing_String(){
    RPS testRPS = new RPS();
    String expected = "player wins";
    assertEquals(expected, testRPS.isRPS("Rock"));
  }


}
