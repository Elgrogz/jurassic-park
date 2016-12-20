package jurassic_park;
import java.util.*;

public class HerbivoreEnclosure extends Enclosure {

  ArrayList<Herbivore> dinosaurs;

  public HerbivoreEnclosure(String name) {
    super(name);
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
    int result = 0;
    for (Herbivore dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    return result;
  }

  public ArrayList<Dinosaur> returnDinosaurs() {
    ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
    for (Herbivore herbivore : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)herbivore;
      dinos.add(dinosaur);
    }
    return dinos;
  }
  
}

