package jurassic_park;
import java.util.*;

public class ZooApp {

  Park park;
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
    System.out.println("\n---------Day " + getDay() + "---------");
    System.out.println("\nCurrent funds: £" + park.getFunds());
    System.out.println("Current visitor numbers: " + park.getVisitorNumbers());
    System.out.println("\n----------Menu----------\n" );
    System.out.println("---View Enclosures (e)");
    System.out.println("---Feed Dinosaur (f)");
    System.out.println("---Buy Dinosaur (b)");
    // System.out.println("---Sell Dinosaur (s)");
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
        // case "s":
        //   listAllDinosaurs();
        //   sell();
        //   index();
        case "n":
          System.out.println("\nLife always finds a way...");
          nextTurn();
          index();
        case "x":
          System.out.println("\nClever Girl!");
          System.exit(0);
      }
      return choice;
  }

  public void getEnclosuresStatus() {
    for (Enclosure enclosure : park.enclosures) {
      System.out.println("\n---------------------");
        System.out.println("Enclosure Name: " + enclosure.getName() + "\nNumber of Dinosaurs: " + enclosure.getSize() + "\n");
        ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
        for (Dinosaur dinosaur : dinosaurs) {
          System.out.println(dinosaur.getInfo());
        }
      }
    }

  public void listAllDinosaurs() {
    for (Enclosure enclosure : park.enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
        for (Dinosaur dinosaur : dinosaurs) {
          System.out.println(dinosaur.getInfo());
      }
    }
  }

  public void feed() {
    System.out.println("Enter the name of the dinosaur you want to feed: ");
    String dinosaurToFeed = System.console().readLine();
    for (Enclosure enclosure : park.enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
        for (Dinosaur dinosaur : dinosaurs) {
          if (dinosaurToFeed.equals(dinosaur.getName())) {
            dinosaur.eat();
            park.setFunds(park.getFunds() - 1000);
          }
        }
      }
  }

//not working

  // public void sell() {
  //   System.out.println("Enter the name of the dinosaur you want to sell: ");
  //   String dinosaurToDelete = System.console().readLine();
  //     for (Enclosure enclosure : park.enclosures) {
  //         for (Dinosaur dinosaur : dinosaurs) {
  //           if (dinosaurToDelete.equals(dinosaur.getName())) {
  //             enclosure.removeDinosaur(dinosaur);
  //             park.setFunds(park.getFunds() + 1000);
  //           }
  //         }
  //     }
  // }

  public void buyMenu() {
    Enclosure aEnclosure = park.getEnclosureByName("Aquarium");
    Aquarium aquarium = (Aquarium)aEnclosure;

    Enclosure hEnclosure = park.getEnclosureByName("Herbivore Cage");
    HerbivoreEnclosure herbivoreEnclosure = (HerbivoreEnclosure)hEnclosure;

    Enclosure avEnclosure = park.getEnclosureByName("Aviary");
    Aviary aviary = (Aviary)avEnclosure;

    Enclosure cEnclosure = park.getEnclosureByName("Carnivore Cage");
    CarnivoreEnclosure carnivoreEnclosure = (CarnivoreEnclosure)cEnclosure;

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

  public void allDinosaursDoAJobbie() {
  for (Enclosure enclosure : park.enclosures) {
    ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
    for (Dinosaur dinosaur : dinosaurs) {
      dinosaur.jobbie();
      }
    }
  }

  public void rampageCheck() {
    for (Enclosure enclosure : park.enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
      for (Dinosaur dinosaur : dinosaurs) {
        if (dinosaur.checkFood() == ("Dinosaur starving")) {
          park.addEscapedDinosaur(dinosaur);
          park.setFunds(park.getFunds() - 5000);
          dinosaur.setFoodLevel(5);
          System.out.println(dinosaur.getName() + " is starving and has gone on a rampage! He's eaten some of the guests and the park has been evacuated! Cost to capture dinosaur and repair cage: £5000");
        }
      }
    }
  }

  public void nextTurn() {
    setNextDay();
    park.setParkPopularityLevel();
    allDinosaursDoAJobbie();
    park.removeAllEscapedDinosaurs();
    rampageCheck();
    park.calculateVisitorsAndFunds();
    index();
  }

  public void play() {
    park.setParkPopularityLevel();
    park.calculateVisitorsAndFunds();
    index();
  }

}
