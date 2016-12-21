import static org.junit.Assert.*;
import org.junit.*;
import jurassic_park.*;


public class DinosaurTest {

  Trex trex;
  Stegosaurus stegosaurus;
  Triceratops triceratops;
  Veloceraptor veloceraptor;
  Pterodactyl pterodactyl;
  Pantydraco pantydraco;
  Saltopus saltopus;
  Mosasaurus mosasaurus;

  @Before
  public void before() {
    trex = new Trex("Jeff");
    stegosaurus = new Stegosaurus("Winston");
    triceratops = new Triceratops("Samuel");
    veloceraptor = new Veloceraptor("Gordon");
    pterodactyl = new Pterodactyl("Wendy");
    pantydraco = new Pantydraco("Susan");
    saltopus = new Saltopus("Mary");
    mosasaurus = new Mosasaurus("Oliver");
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
    pantydraco.setFoodLevel(3);
    assertEquals(3, pantydraco.getFoodLevel());
  }

  @Test
  public void canSetPopularityLevel() {
    saltopus.setPopularityLevel(2);
    assertEquals(2, saltopus.getPopularityLevel());
  }

  @Test
  public void canDoAJobbie() {
    stegosaurus.jobbie();
    assertEquals(4, stegosaurus.getFoodLevel());
  }

  @Test
  public void canEat() {
    mosasaurus.jobbie();
    mosasaurus.jobbie();
    mosasaurus.eat();
    assertEquals(5, mosasaurus.getFoodLevel());
  }

  @Test
  public void canGetInfo() {
    assertEquals("Name: Wendy - Current Food Level: 5 - Species: PTERODACTYL\n", pterodactyl.getInfo());
  }

}