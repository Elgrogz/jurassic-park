package jurassic_park;

public class Trex extends Dinosaur implements Carnivore {

  public Trex(String name){
    super(name);
    this.type = DinosaurTypes.TYRANNASAURUS;
    this.popularityLevel = 5;
  } 
}