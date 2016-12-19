package jurassic_park;
import java.util.*;

public class CarnivoreEnclosure extends Enclosure {

  ArrayList<Carnivore> dinosaurs;
  int enclosurePopularity;

  public CarnivoreEnclosure(String name) {
    super(name);
    this.enclosurePopularity = 0;
    this.dinosaurs = new ArrayList<Carnivore>();
  }

  public int getSize() {
    return dinosaurs.size();
  }

  public void addDinosaur(Carnivore carnivore) {  
    dinosaurs.add(carnivore);
  }

  public void removeDinosaur(Carnivore carnivore) {
    dinosaurs.remove(carnivore);
  }

  public void getEnclosurePopularity() {
    int result = 0;
    for (Carnivore dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    this.enclosurePopularity = result;
  }

}