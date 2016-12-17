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
    trex = new Trex("Jeff");
    stegosaurus = new Stegosaurus("Winston");
    tricerotops = new Tricerotops("Samuel");
    carnivoreEnclosure = new CarnivoreEnclosure("T-rex cage");
    herbivoreEnclosure = new HerbivoreEnclosure("Herbivore Cage");
    park = new Park("Jurassic Park");
  }

}

