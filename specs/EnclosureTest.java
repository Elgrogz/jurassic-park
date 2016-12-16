import static org.junit.Assert.*;
import org.junit.*;
import jurassic_park.*;
import java.util.*;

public class EnclosureTest {

  Trex trex;
  Stegosaurus stegosaurus;
  Tricerotops tricerotops;
  Veloceraptor veloceraptor;
  Pterodactyl pterodactyl;
  Pantydraco pantydraco;
  Saltopus saltopus;
  Mosasaurus mosasaurus;
  CarnivoreEnclosure carnivoreEnclosure;

  @Before
  public void before() {
    trex = new Trex("Jeff");
    stegosaurus = new Stegosaurus("Winston");
    tricerotops = new Tricerotops("Samuel");
    veloceraptor = new Veloceraptor("Gordon");
    pterodactyl = new Pterodactyl("Wendy");
    pantydraco = new Pantydraco("Susan");
    saltopus = new Saltopus("Mary");
    mosasaurus = new Mosasaurus("Oliver");
    carnivoreEnclosure = new CarnivoreEnclosure("T-rex cage");
  }

  @Test
  public void canGetEnclosureName() {
    assertEquals("T-rex cage", carnivoreEnclosure.getName());
  }

  @Test
  public void canGetEnclosureSize() {
    assertEquals(0, carnivoreEnclosure.getSize());
  }

}