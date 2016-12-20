package jurassic_park;

public class Pantydraco extends Dinosaur implements Herbivore {

  public Pantydraco(String name){
    super(name);
    this.type = DinosaurTypes.PANTYDRACO;
    this.popularityLevel = 1;
  } 
}