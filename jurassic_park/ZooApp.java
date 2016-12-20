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

  public void nextDay() {
    this.dayCounter += 1;
  }


  public String index() {

    System.out.println("Day " + getDay());
    System.out.println("-------Menu-------\n" );
    System.out.println("View Enclosures (e)");
    System.out.println("View Dinosaurs (d)");
    System.out.println("View Funds (f)");
    System.out.println("View Visitor Numbers (v)");
    System.out.println("Buy Dinosaur (b)");
    System.out.println("Next Turn (n)");
    System.out.println("What would you like to do?");
  
    String choice = System.console().readLine();

      switch (choice) {
        case "e":
          park.getEnclosuresStatus();
          index();
        case "d":
          System.out.println("View Dinosaurs (d)");
        case "f":
          System.out.println("View Funds (f)");
        case "v":
          System.out.println("View Visitor Numbers (v)");
        case "b":
          System.out.println("Buy Dinosaur (b)");
        case "n":
          System.out.println("Next Turn (n)");
      }
      return choice;
  }







  // public void nextTurn() {
  //   //park.nextDay();
  //   park.setPopularityLevel();
  //   park.allDinosaursTakeACrap();
  //   park.rampageCheck();
  //   park.calculateVisitorsAndFunds();
  //   System.out.println("Day " + getDay());
  //   //park.statusUpdate?
  // }


  public void play() {
    index();
  }

}
