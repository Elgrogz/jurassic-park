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

    System.out.println("Day " + getDay());
    System.out.println("-------Menu-------\n" );
    System.out.println("---View Enclosures (e)");
    System.out.println("---View Dinosaurs (d)");
    System.out.println("---View Funds (f)");
    System.out.println("---View Visitor Numbers (v)");
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
          System.out.println("View Dinosaurs (d)");
          index();
        case "f":
          System.out.println("------------------");
          System.out.println("Current funds: £" + park.getFunds());
          index();
        case "v":
          System.out.println("------------------");
          System.out.println("Current visitor numbers: " + park.getVisitorNumbers());
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
