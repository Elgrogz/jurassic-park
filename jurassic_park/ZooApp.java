package jurassic_park;

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
    System.out.println("---View Dinosaurs (d)");
    System.out.println("---Buy Dinosaur (b)");
    System.out.println("---Next Turn (n)");
    System.out.println("---Exit (x)");
    System.out.println("\nWhat would you like to do?");
  
    String choice = System.console().readLine();

      switch (choice) {
        case "e":
          park.getEnclosuresStatus();
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
