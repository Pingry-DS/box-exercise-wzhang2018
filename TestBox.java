// To run this with a default runner try
// java org.junit.runner.JUnitCore TestBox

// static import gives us access to assert methods without class name/
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBox {

  @Test
  public void testNewEmpty() {
    Box b = new Box();
    assertEquals(b.isFull(), false);
  }

  @Test
  public void testNewFull() {
    Box<String> b = new Box<String>("Hello");
    assertEquals(b.isFull(), true);
  }
}
