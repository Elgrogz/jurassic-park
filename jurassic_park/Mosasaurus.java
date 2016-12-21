package jurassic_park;

public class Mosasaurus extends Dinosaur implements Swimmable {

  public Mosasaurus(String name){
    super(name);
    this.type = DinosaurTypes.MOSASAURUS;
    this.popularityLevel = 4;
  } 
}