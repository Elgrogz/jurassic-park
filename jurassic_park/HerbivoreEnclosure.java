package jurassic_park;
import java.util.*;

public class HerbivoreEnclosure extends Enclosure {

  ArrayList<Herbivore> dinosaurs;
  int enclosurePopularity;

  public HerbivoreEnclosure(String name) {
    super(name);
    this.enclosurePopularity = 0;
    this.dinosaurs = new ArrayList<Herbivore>();
  }

  public int getSize() {
    return dinosaurs.size();
  }

  public void addDinosaur(Herbivore herbivore) {  
    dinosaurs.add(herbivore);
  }

  public void removeDinosaur(Herbivore herbivore) {  
    dinosaurs.remove(herbivore);
  }

  public int getEnclosurePopularity() {
    setEnclosurePopularity();
    return this.enclosurePopularity;
  }

  public void setEnclosurePopularity() {
    int result = 0;
    for (Herbivore dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    this.enclosurePopularity = result;
  }


}

