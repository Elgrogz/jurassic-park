package jurassic_park;
import java.util.*;

public class Aquarium extends Enclosure {

  ArrayList<Swimmable> dinosaurs;
  int enclosurePopularity;

  public Aquarium(String name) {
    super(name);
    this.enclosurePopularity = 0;
    this.dinosaurs = new ArrayList<Swimmable>();
  }

  public int getSize() {
    return dinosaurs.size();
  }

  public void addDinosaur(Swimmable swimmer) {  
    dinosaurs.add(swimmer);
  }

  public void deleteDinosaur(Swimmable swimmer) {  
    dinosaurs.remove(swimmer);
  }

  public int getEnclosurePopularity() {
    setEnclosurePopularity();
    return this.enclosurePopularity;
  }

  public void setEnclosurePopularity() {
    int result = 0;
    for (Swimmable dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    this.enclosurePopularity = result;
  }


}
