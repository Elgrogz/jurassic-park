package jurassic_park;
import java.util.*;

public class Park {

  String name;
  ArrayList<Dinosaur> escapedDinosaurs;
  ArrayList<Enclosure> enclosures;
  int parkPopularityLevel;
  int currentVisitors;
  BankAccount bankAccount;


  public Park(String name) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
    this.escapedDinosaurs = new ArrayList<Dinosaur>();
    this.parkPopularityLevel = 0;
    this.currentVisitors = 0;
    this.bankAccount = new BankAccount();
  }

  public String getName() {
    return this.name;
  }

  public int getVisitorNumbers() {
    return this.currentVisitors;
  }

  public int getFunds() {
    return bankAccount.funds;
  }

  public int getNumOfEscapedDinosaurs() {
    return escapedDinosaurs.size();
  }

  public int getNumOfEnclosures() {
    return enclosures.size();
  }

  public String setName(String name) {
    return this.name = name;
  }

  public void setCurrentVisitors(int currentVisitors) {
    this.currentVisitors = currentVisitors;
  }

  public void setFunds(int funds) {
    this.bankAccount.funds = funds;
  }

  public void addEnclosure(Enclosure enclosure) {
    enclosures.add(enclosure);
  }

  public String getEnclosureName(Enclosure enclosureToFind) {
    String nameToReturn = null;
    for (Enclosure enclosure : enclosures) {
      if (enclosure.getName() == enclosureToFind.getName()) {
        nameToReturn = enclosure.getName();
      }
    }
    return nameToReturn;
  }
  
  public int getParkPopularityLevel() {
    return this.parkPopularityLevel; 
  }

  public void setParkPopularityLevel() {
    int result = 0;
    for (Enclosure enclosure : enclosures) {
      result += enclosure.getEnclosurePopularity();
    }
    this.parkPopularityLevel = result;
  }

  public void calculateVisitorsAndFunds() {
    if (escapedDinosaurs.isEmpty()) {
      setCurrentVisitors(this.getParkPopularityLevel() * 100);
      setFunds(getFunds() + (getVisitorNumbers() * 10));
    }
    else {
      setCurrentVisitors(0);
    }
  }

  public void addEscapedDinosaur(Dinosaur dinosaur) {  
    escapedDinosaurs.add(dinosaur);
  }

  public void removeEscapedDinosaur(Dinosaur dinosaur) {  
    escapedDinosaurs.remove(dinosaur);
  }

  public void rampageCheck() {
    for (Enclosure enclosure : enclosures) {
      ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
      for (Dinosaur dinosaur : dinosaurs) {
        if (dinosaur.checkFood() == "Dinosaur starving") {
          addEscapedDinosaur(dinosaur);
          System.out.println(dinosaur.getName() + " is starving and has gone on a rampage! He's eaten some of the guests and the park has been evacuated!");
        }
      }
    }
  }

  public void allDinosaursTakeADump() {
  for (Enclosure enclosure : enclosures) {
    ArrayList<Dinosaur> dinosaurs = enclosure.returnDinosaurs();
    for (Dinosaur dinosaur : dinosaurs) {
      dinosaur.takeACrap();
      }
    }
  }

}