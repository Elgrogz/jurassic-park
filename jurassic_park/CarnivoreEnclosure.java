package jurassic_park;
import java.util.*;

public class CarnivoreEnclosure extends Enclosure {

  ArrayList<Carnivore> dinosaurs;

  public CarnivoreEnclosure(String name) {
    super(name);
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

  public ArrayList<Dinosaur> returnDinosaurs() {
    ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
    for (Carnivore carnivore : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)carnivore;
      dinos.add(dinosaur);
    }
    return dinos;
  }

}