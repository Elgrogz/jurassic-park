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

  public int getEnclosurePopularity() {
    int result = 0;
    for (Carnivore dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    return result;
  }

  public ArrayList<Dinosaur> returnDinosaurs() {
    ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
    for (Carnivore carnivore : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)carnivore;
      dinos.add(dinosaur);
    }
    return dinos;
  }

  public void status() {
    System.out.println("\nEnclosure Name: " + getName() + "\nNumber of Dinosaurs: " + getSize() + "\n");
    
    for (Carnivore carnivore : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)carnivore;
      System.out.println("Name: " + dinosaur.getName() + "\nFood Level: " + dinosaur.getFoodLevel());
    }
    
    System.out.println("\n---------------------");

  }
 

  // @Override
  // public String toString() {
  //   return "Name: " + getName() + "\nFood Level: " + getFoodLevel();
  // }

}