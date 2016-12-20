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
        case "d":
          System.out.println("Feed Dinosaur (f)");
          index();
        case "b":
          System.out.println("Buy Dinosaur (b)");
          index();
        case "n":
          System.out.println("Life always finds a way...");
          nextTurn();
          index();
        case "x":
          System.out.println("Clever Girl!");
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

  public void nextTurn() {
    setNextDay();
    park.setParkPopularityLevel();
    park.allDinosaursTakeADump();
    park.rampageCheck();
    park.calculateVisitorsAndFunds();
    System.out.println("Day " + getDay());
  }

  public void play() {
    park.setParkPopularityLevel();
    park.calculateVisitorsAndFunds();
    index();
  }

}
