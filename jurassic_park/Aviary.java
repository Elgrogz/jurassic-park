package jurassic_park;
import java.util.*;

public class Aviary extends Enclosure {

  ArrayList<Flyable> dinosaurs;

  public Aviary(String name) {
    super(name);
    this.dinosaurs = new ArrayList<Flyable>();
  }

  public int getSize() {
    return dinosaurs.size();
  }

  public void addDinosaur(Flyable flyer) {  
    dinosaurs.add(flyer);
  }

  public void removeDinosaur(Flyable flyer) {  
    dinosaurs.remove(flyer);
  }

  public void getEnclosurePopularity() {
    int result = 0;
    for (Flyable dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    this.enclosurePopularity = result;
  }


}
