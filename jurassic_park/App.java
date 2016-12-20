package jurrasic_park;

public class App {

  Park park;
  int dayCounter;

  public App(Park park) {
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
    System.out.println("")
  }







  public void nextTurn() {
    //park.nextDay();
    park.setPopularityLevel();
    park.allDinosaursTakeACrap();
    park.rampageCheck();
    park.calculateVisitorsAndFunds();
    System.out.println("Day " + getDay());
    //park.statusUpdate?
  }


  public void play() {
    index();
  }

}