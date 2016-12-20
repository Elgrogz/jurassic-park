package jurassic_park;

public class Saltopus extends Dinosaur implements Herbivore {

  public Saltopus(String name){
    super(name);
    this.type = DinosaurTypes.SALTOPUS;
    this.popularityLevel = 1;
  } 
}