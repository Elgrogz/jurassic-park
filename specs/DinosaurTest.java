import static org.junit.Assert.*;
import org.junit.*;
import jurassic_park.*;

public class DinosaurTest {

  Trex trex;

  @Before
  public void before() {
    trex = new Trex("Jeff");
  }

  @Test
  public void canGetName() {
    assertEquals("Jeff", trex.getName());
  }

}