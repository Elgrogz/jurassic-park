package jurassic_park;

public abstract class Enclosure {

  String name;
  Boolean damaged;

  public Enclosure(String Name)
    this.name = name;
    this.damaged = false;


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
}