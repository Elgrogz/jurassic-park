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

  @Test
  public void canGetFoodLevel() {
    assertEquals(5, trex.getFoodLevel());
  }

  @Test
  public void canGetPopularityLevel() {
    assertEquals(5, trex.getPopularityLevel());
  }

  @Test
  public void canSetName() {
    trex.setName("Bob");
    assertEquals("Bob", trex.getName());
  }

  @Test
  public void canSetFoodLevel() {
    trex.setFoodLevel(3);
    assertEquals(3, trex.getFoodLevel());
  }

  @Test
  public void canSetPopularityLevel() {
    trex.setPopularityLevel(2);
    assertEquals(2, trex.getPopularityLevel());
  }

  @Test
  public void canTakeACrap() {
    trex.takeACrap();
    assertEquals(4, trex.getFoodLevel());
  }

}