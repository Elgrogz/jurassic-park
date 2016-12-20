package jurassic_park; 
import java.util.*;

public abstract class Enclosure {

  String name;
  Boolean damaged;

  public Enclosure(String name) {
    this.name = name;
    this.damaged = false;
  }

  public String getName() {
    return this.name;
  } 

  public Boolean getDamageStatus() {
    return this.damaged;
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void damage() {
    this.damaged = true;
  }

  public abstract int getEnclosurePopularity();
  public abstract ArrayList<Dinosaur> returnDinosaurs();
  public abstract int getSize();

}