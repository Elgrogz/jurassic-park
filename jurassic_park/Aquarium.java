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

  public void removeDinosaur(Swimmable swimmer) {  
    dinosaurs.remove(swimmer);
  }

  public ArrayList<Dinosaur> returnDinosaurs() {
    ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
    for (Swimmable swimmable : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)swimmable;
      dinos.add(dinosaur);
    }
    return dinos;
  }

}
