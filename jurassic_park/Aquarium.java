package jurassic_park;
import java.util.*;

public class Aquarium extends Enclosure {

  ArrayList<Swimmable> dinosaurs;

  public Aquarium(String name) {
    super(name);
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

}
