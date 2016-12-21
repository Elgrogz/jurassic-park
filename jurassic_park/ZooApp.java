package jurassic_park;
import java.util.*;

public class ZooApp {

  Park park;
  CarnivoreEnclosure carnivoreEnclosure;
  HerbivoreEnclosure herbivoreEnclosure;
  Aquarium aquarium;
  Aviary aviary;
  int dayCounter;

  public ZooApp(Park park) {
    this.park = park;
    this.dayCounter = 1;
  }

  public int getDay() {
    return this.dayCounter;
  }

  public void setNextDay() {
    this.dayCounter += 1;
  }

  public String index() {

    System.out.println("\n-------Day " + getDay() + "-------");
    System.out.println("\nCurrent funds: £" + park.getFunds());
    System.out.println("Current visitor numbers: " + park.getVisitorNumbers());
    System.out.println("\n-------Menu-------\n" );
    System.out.println("---View Enclosures (e)");
    System.out.println("---Feed Dinosaur (f)");
    System.out.println("---Buy Dinosaur (b)");
    System.out.println("---Next Turn (n)");
    System.out.println("---Exit (x)");
    System.out.println("\nWhat would you like to do?");
  
    String choice = System.console().readLine();

      switch (choice) {
        case "e":
          getEnclosuresStatus();
          index();
        case "f":
          listAllDinosaurs();
          feed();
          index();
        case "b":
          buyMenu();
          index();
        case "n":
          System.out.println("\n Life always finds a way...");
          nextTurn();
          index();
        case "x":
          System.out.println("\nClever Girl!");
          break;
      }
      return choice;
  }

  public void getEnclosuresStatus() {
    for (Enclosure enclosure : park.enclosures) {
      System.out.println("\n---------------------");
        System.out.println("Enclosure Name: " + enclosure.getName() + "\nNumber of Dinosaurs: " + enclosure.getSize() + "\n");
        ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
        for (Dinosaur dinosaur : dinosaurs) {
          System.out.println("Name: " + dinosaur.getName() + "\nFood Level: " + dinosaur.getFoodLevel() + "\nType: " + dinosaur.getType() + "\n");
        }
      }
    }

  public void listAllDinosaurs() {
    for (Enclosure enclosure : park.enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
        for (Dinosaur dinosaur : dinosaurs) {
          System.out.println("Name: " + dinosaur.getName() + "          Food Level: " + dinosaur.getFoodLevel() + "          Type: " + dinosaur.getType() + "\n");
      }
    }
  }

  public void feed() {
    System.out.println("Enter the name of the dinosaur you want to feed: ");
    String dinosaurToFeed = System.console().readLine();
    for (Enclosure enclosure : park.enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
        for (Dinosaur dinosaur : dinosaurs) {
          if (dinosaurToFeed == dinosaur.getName()) {
            dinosaur.eat();
            park.setFunds(-1000);
          }
        }
      }
  }

  public void buyMenu() {
    System.out.println("Enter the name of your new dinosaur: ");
    String name = System.console().readLine();

    System.out.println("Enter the species of dinosaur you want: ");
    System.out.println("Mosasaurus (m)");
    System.out.println("Pantydraco (p)");
    System.out.println("Pterodactyl (pt)");
    System.out.println("Saltopus (s)");
    System.out.println("Stegosaurus (st)");
    System.out.println("Tyrannasaurus (ty)");
    System.out.println("Triceratops (t)");
    System.out.println("Veloceraptor (v)");
    String choice = System.console().readLine();

      switch (choice) {
        case "m":
          Mosasaurus mosasaurus = new Mosasaurus(name);
          aquarium.addDinosaur(mosasaurus);
          index();
        case "p":
          Pantydraco pantydraco = new Pantydraco(name);
          herbivoreEnclosure.addDinosaur(pantydraco);
          index();
        case "pt":
          Pterodactyl pterodactyl = new Pterodactyl(name);
          aviary.addDinosaur(pterodactyl);
          index();
        case "s":
          Saltopus saltopus = new Saltopus(name);
          herbivoreEnclosure.addDinosaur(saltopus);
          index();
        case "st":
          Stegosaurus stegosaurus = new Stegosaurus(name);
          herbivoreEnclosure.addDinosaur(stegosaurus);
          index();
        case "ty":
          Trex tyrannasaurus = new Trex(name);
          carnivoreEnclosure.addDinosaur(tyrannasaurus);
          index();
        case "t":
          Triceratops triceratops = new Triceratops(name);
          herbivoreEnclosure.addDinosaur(triceratops);
          index();
        case "v":
          Veloceraptor veloceraptor = new Veloceraptor(name);
          carnivoreEnclosure.addDinosaur(veloceraptor);
          index(); 
      }
  }

  public void allDinosaursTakeADump() {
  for (Enclosure enclosure : park.enclosures) {
    ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
    for (Dinosaur dinosaur : dinosaurs) {
      dinosaur.takeACrap();
      }
    }
  }

  public void rampageCheck() {
    for (Enclosure enclosure : park.enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
      for (Dinosaur dinosaur : dinosaurs) {
        if (dinosaur.checkFood() == "Dinosaur starving") {
          park.addEscapedDinosaur(dinosaur);
          System.out.println(dinosaur.getName() + " is starving and has gone on a rampage! He's eaten some of the guests and the park has been evacuated!");
        }
      }
    }
  }

  public void nextTurn() {
    setNextDay();
    park.setParkPopularityLevel();
    allDinosaursTakeADump();
    rampageCheck();
    park.calculateVisitorsAndFunds();
  }

  public void play() {
    park.setParkPopularityLevel();
    park.calculateVisitorsAndFunds();
    index();
  }

}
