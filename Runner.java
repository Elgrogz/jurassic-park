import jurassic_park.*;
import java.util.*;

public class Runner {

  public static void main(String[] args) {

    System.out.println("Welcome to Gregors incredible Jurassic Park Simulator. What would you like to call your park?");
    String name = System.console().readLine();

    Park park = new Park(name);
    System.out.println("Your zoo is called " + park.getName());
    
    CarnivoreEnclosure carnivoreEnclosure = new CarnivoreEnclosure("T-rex cage");
    park.addEnclosure(carnivoreEnclosure);
    HerbivoreEnclosure herbivoreEnclosure = new HerbivoreEnclosure("Herbivore Cage");
    park.addEnclosure(herbivoreEnclosure);
    Aquarium aquarium = new Aquarium("Aquarium");
    park.addEnclosure(aquarium);
    Aviary aviary = new Aviary("Aviary");
    park.addEnclosure(aviary);
    Trex trex = new Trex("Jeff");
    carnivoreEnclosure.addDinosaur(trex);
    Stegosaurus stegosaurus = new Stegosaurus("Winston");
    herbivoreEnclosure.addDinosaur(stegosaurus);
    Tricerotops tricerotops = new Tricerotops("Samuel");
    herbivoreEnclosure.addDinosaur(tricerotops);
    Veloceraptor veloceraptor = new Veloceraptor("Gordon");
    carnivoreEnclosure.addDinosaur(veloceraptor);
    Pterodactyl pterodactyl = new Pterodactyl("Wendy");
    aviary.addDinosaur(pterodactyl);
    Pantydraco pantydraco = new Pantydraco("Susan");
    herbivoreEnclosure.addDinosaur(pantydraco);
    Saltopus saltopus = new Saltopus("Mary");
    herbivoreEnclosure.addDinosaur(saltopus);
    Mosasaurus mosasaurus = new Mosasaurus("Oliver");
    aquarium.addDinosaur(mosasaurus);

    App app = new App(park);

    app.play;

  }
}