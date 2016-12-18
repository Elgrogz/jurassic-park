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
  HerbivoreEnclosure herbivoreEnclosure;
  Aquarium aquarium;
  Aviary aviary;

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
    herbivoreEnclosure = new HerbivoreEnclosure("Herbivore Cage");
    aquarium = new Aquarium("Aquarium");
    aviary = new Aviary("Aviary");
  }

  @Test
  public void canGetEnclosureName() {
    assertEquals("T-rex cage", carnivoreEnclosure.getName());
  }

  @Test
  public void canGetEnclosureSize() {
    assertEquals(0, carnivoreEnclosure.getSize());
  }

  @Test
  public void canAddCarnivore() {
     carnivoreEnclosure.addDinosaur(trex);
     assertEquals(1, carnivoreEnclosure.getSize()); 
  }

  @Test
  public void canAddHerbivore() {
    herbivoreEnclosure.addDinosaur(tricerotops);
    assertEquals(1, herbivoreEnclosure.getSize()); 
  }

  @Test
  public void canAddSwimmer() {
    aquarium.addDinosaur(mosasaurus);
    assertEquals(1, aquarium.getSize()); 
  }

  @Test
  public void canAddFlyer() {
    aviary.addDinosaur(pterodactyl);
    assertEquals(1, aviary.getSize()); 
  }      

  @Test
  public void canRemoveFlyer() {
    aviary.addDinosaur(pterodactyl);
    aviary.removeDinosaur(pterodactyl);
    assertEquals(0, aviary.getSize()); 
  } 
}