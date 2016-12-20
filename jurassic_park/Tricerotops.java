package jurassic_park;

public class Tricerotops extends Dinosaur implements Herbivore {

  public Tricerotops(String name){
    super(name);
    this.type = DinosaurTypes.TRICERATOPS;
    this.popularityLevel = 3;
  } 
}