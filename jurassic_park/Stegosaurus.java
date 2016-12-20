package jurassic_park;

public class Stegosaurus extends Dinosaur implements Herbivore {

  public Stegosaurus(String name) {
    super(name);
    this.type = DinosaurTypes.HERBIVORE;
    this.popularityLevel = 3;
  } 
}