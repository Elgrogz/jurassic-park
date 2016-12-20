package jurassic_park;

public class Pterodactyl extends Dinosaur implements Flyable {

  public Pterodactyl(String name){
    super(name);
    this.type = DinosaurTypes.FLYING;
    this.popularityLevel = 4;
  } 

  public void fly() {

  }
}