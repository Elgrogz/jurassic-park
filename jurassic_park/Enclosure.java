package jurassic_park; 
import java.util.*;

public abstract class Enclosure {

  String name;

  public Enclosure(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  } 

  public void setName(String name) {
    this.name = name;
  }

  public abstract ArrayList<Dinosaur> returnDinosaurs();
  public abstract int getSize();

}