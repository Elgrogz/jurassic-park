import static org.junit.Assert.*;
import org.junit.*;
import jurassic_park.*;
import java.util.*;

public class ParkTest {

  Park park;
  Trex trex;
  Stegosaurus stegosaurus;
  Tricerotops tricerotops;
  CarnivoreEnclosure carnivoreEnclosure;
  HerbivoreEnclosure herbivoreEnclosure;

  @Before
  public void before() {
    park = new Park("Jurassic Park");
    carnivoreEnclosure = new CarnivoreEnclosure("T-rex cage");
    herbivoreEnclosure = new HerbivoreEnclosure("Herbivore Cage");
    trex = new Trex("Jeff");
    stegosaurus = new Stegosaurus("Winston");
    tricerotops = new Tricerotops("Samuel");
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
    trex.takeACrap();
    trex.takeACrap();
    trex.takeACrap();
    trex.takeACrap();
    trex.takeACrap();
    
  }
}

