package jurassic_park;

public class Tricerotops extends Dinosaur implements Herbivore {

  public Tricerotops(String name){
    super(name);
    this.type = DinosaurTypes.HERBIVORE;
    this.popularityLevel = 3;
  } 
}