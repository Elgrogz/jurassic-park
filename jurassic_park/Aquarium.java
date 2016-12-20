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

  @Override
  public int getEnclosurePopularity() {
    int result = 0;
    for (Swimmable dinosaur : dinosaurs) {
      result += dinosaur.getPopularityLevel();
    }
    return result;
  }

  public ArrayList<Dinosaur> returnDinosaurs() {
    ArrayList<Dinosaur> dinos = new ArrayList<Dinosaur>();
    for (Swimmable swimmable : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)swimmable;
      dinos.add(dinosaur);
    }
    return dinos;
  }

  public void  status() {
    System.out.println("\nEnclosure Name: " + getName() + "\nNumber of Dinosaurs: " + getSize() + "\n");
    
    for (Swimmable swimmer : dinosaurs) {
      Dinosaur dinosaur = (Dinosaur)swimmer;
      System.out.println("Name: " + dinosaur.getName() + "\nFood Level: " + dinosaur.getFoodLevel());
    }
    
    System.out.println("\n---------------------");
  }


}
