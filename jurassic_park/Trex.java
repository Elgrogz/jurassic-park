package jurassic_park;

public class Trex extends Dinosaur implements Carnivore {

  public Trex(String name){
    super(name);
    this.type = DinosaurTypes.CARNIVORE;
    this.popularityLevel = 5;
  } 
}