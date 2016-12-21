package jurassic_park;

public class Triceratops extends Dinosaur implements Herbivore {

  public Triceratops(String name){
    super(name);
    this.type = DinosaurTypes.TRICERATOPS;
    this.popularityLevel = 3;
  } 
}