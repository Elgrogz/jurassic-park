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

  public int getEnclosurePopularity() {
    int result = 0;
    for (Flyable dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    return result;
  }

  public ArrayList<Dinosaur> returnDinosaurs() {
    ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
    for (Flyable flyer : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)flyer;
      dinos.add(dinosaur);
    }
    return dinos;
  }

  public void status() {
    System.out.println("\nEnclosure Name: " + getName() + "\nNumber of Dinosaurs: " + getSize() + "\n");
    
    for (Flyable flyer : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)flyer;
      System.out.println("Name: " + dinosaur.getName() + "\nFood Level: " + dinosaur.getFoodLevel());
    }
    
    System.out.println("\n---------------------");
  }

}
