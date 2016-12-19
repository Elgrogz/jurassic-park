import static org.junit.Assert.*;
import org.junit.*;
import jurassic_park.*;
import java.util.*;

public class ParkTest {

  Park park;
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
    park = new Park("Jurassic Park");
    carnivoreEnclosure = new CarnivoreEnclosure("T-rex cage");
    herbivoreEnclosure = new HerbivoreEnclosure("Herbivore Cage");
    aquarium = new Aquarium("Aquarium");
    aviary = new Aviary("Aviary");
    trex = new Trex("Jeff");
    stegosaurus = new Stegosaurus("Winston");
    tricerotops = new Tricerotops("Samuel");
    veloceraptor = new Veloceraptor("Gordon");
    pterodactyl = new Pterodactyl("Wendy");
    pantydraco = new Pantydraco("Susan");
    saltopus = new Saltopus("Mary");
    mosasaurus = new Mosasaurus("Oliver");
  }

  @Test
  public void canGetParkName() {
    assertEquals("Jurassic Park", park.getName());
  }

  @Test
  public void canGetVisitorNumbers() {
    assertEquals(0, park.getVisitorNumbers());
  }

  @Test
  public void canGetFunds() {
    assertEquals(0, park.getFunds());
  }

  @Test
  public void canGetNumOfEscapedDinosaurs() {
    assertEquals(0, park.getNumOfEscapedDinosaurs());
  }

  @Test
  public void canAddEscapedDinosaurs() {
    park.addEscapedDinosaur(trex);
    assertEquals(1, park.getNumOfEscapedDinosaurs());
  }

  @Test
  public void canRemoveEscapedDinosaurs() {
    park.addEscapedDinosaur(trex);
    park.removeEscapedDinosaur(trex);
    assertEquals(0, park.getNumOfEscapedDinosaurs());
  }

  @Test
  public void canAddEnclosure() {
    park.addEnclosure(carnivoreEnclosure);
    park.addEnclosure(herbivoreEnclosure);
    assertEquals(2, park.getNumOfEnclosures());
    assertEquals("Herbivore Cage", park.getEnclosureName(herbivoreEnclosure));
  }

  @Test
  public void canAddDinosaurToEnclosure() {
    park.addEnclosure(carnivoreEnclosure);
    carnivoreEnclosure.addDinosaur(trex);
    assertEquals("T-rex cage", park.getEnclosureName(carnivoreEnclosure));
    assertEquals(1, carnivoreEnclosure.getSize());
  }

  @Test
  public void dinosaurCanRampage() {
    park.addEnclosure(carnivoreEnclosure);
    carnivoreEnclosure.addDinosaur(trex);
    park.setParkPopularityLevel();
    park.calculateVisitorsAndFunds();
    assertEquals(500, park.getVisitorNumbers());
    trex.takeACrap();
    trex.takeACrap();
    trex.takeACrap();
    trex.takeACrap();
    park.rampageCheck();
    assertEquals(500, park.getVisitorNumbers());
    trex.takeACrap();
    park.rampageCheck();
    park.calculateVisitorsAndFunds();
    assertEquals(0, park.getVisitorNumbers());
  }

  @Test
  public void canGetParkPopularity() {
    park.addEnclosure(carnivoreEnclosure);
    park.addEnclosure(herbivoreEnclosure);
    park.addEnclosure(aquarium);
    park.addEnclosure(aviary);
    carnivoreEnclosure.addDinosaur(trex);
    carnivoreEnclosure.addDinosaur(veloceraptor);
    herbivoreEnclosure.addDinosaur(tricerotops);
    aviary.addDinosaur(pterodactyl);
    aquarium.addDinosaur(mosasaurus);
    park.setParkPopularityLevel();
    assertEquals(20, park.getParkPopularityLevel());
  }

  @Test
  public void canGetCurrentVisitors() {
    park.addEnclosure(carnivoreEnclosure);
    park.addEnclosure(herbivoreEnclosure);
    park.addEnclosure(aquarium);
    park.addEnclosure(aviary);
    carnivoreEnclosure.addDinosaur(trex);
    carnivoreEnclosure.addDinosaur(veloceraptor);
    herbivoreEnclosure.addDinosaur(tricerotops);
    aviary.addDinosaur(pterodactyl);
    aquarium.addDinosaur(mosasaurus);
    park.setParkPopularityLevel();
    park.calculateVisitorsAndFunds();
    assertEquals(2000, park.getVisitorNumbers());
  }

  @Test
  public void canUpdateFunds() {
    park.addEnclosure(carnivoreEnclosure);
    park.addEnclosure(herbivoreEnclosure);
    park.addEnclosure(aquarium);
    park.addEnclosure(aviary);
    carnivoreEnclosure.addDinosaur(trex);
    carnivoreEnclosure.addDinosaur(veloceraptor);
    herbivoreEnclosure.addDinosaur(tricerotops);
    aviary.addDinosaur(pterodactyl);
    aquarium.addDinosaur(mosasaurus);
    assertEquals(0, park.getFunds());
    park.setParkPopularityLevel();
    park.calculateVisitorsAndFunds();
    assertEquals(2000, park.getVisitorNumbers());
    assertEquals(20000, park.getFunds());
  }


}

