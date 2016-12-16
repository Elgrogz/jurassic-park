package jurassic_world;

public class CarnivoreEnclosure extends Enclosure {

  ArrayList<Carnivore> dinosaurs;

  public CarnivoreEnclosure(String name) {
    super(name, damaged);
    this.dinosaurs = new ArrayList<Carnivores>();
  }

  public void addDinosaur(Carnivore carnivore) {
    dinosaurs.add(carnivore);
  }
}