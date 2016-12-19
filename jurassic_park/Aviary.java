package jurassic_park;
import java.util.*;

public class Aviary extends Enclosure {

  ArrayList<Flyable> dinosaurs;
  int enclosurePopularity;

  public Aviary(String name) {
    super(name);
    this.enclosurePopularity = 0;
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

  public int getEnclosurePopularity() {
    setEnclosurePopularity();
    return this.enclosurePopularity;
  }

  public void setEnclosurePopularity() {
    int result = 0;
    for (Flyable dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    this.enclosurePopularity = result;
  }


}
