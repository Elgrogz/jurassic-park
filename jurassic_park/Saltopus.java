package jurassic_park;

public class Saltopus extends Dinosaur implements Herbivore {

  public Saltopus(String name){
    super(name);
    this.type = DinosaurTypes.HERBIVORE;
    this.popularityLevel = 1;
  } 
}