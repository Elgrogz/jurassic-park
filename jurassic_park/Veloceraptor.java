package jurassic_park;

public class Veloceraptor extends Dinosaur implements Carnivore {

  public Veloceraptor(String name){
    super(name);
    this.type = DinosaurTypes.VELOCERAPTOR;
    this.popularityLevel = 4;
  } 
}