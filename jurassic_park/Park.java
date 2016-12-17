package jurassic_park;
import java.util.*;

public class Park {

  String name;
  ArrayList<Dinosaur> escapedDinosaurs;
  ArrayList<ArrayList<Enclosure>> enclosures;
  int currentVisitors;
  int funds;


  public Park(String name) {
    this.name = name;
    this.enclosures = new ArrayList<ArrayList<Enclosure>>();
    this.escapedDinosaurs = new ArrayList<Dinosaur>();
    this.currentVisitors = 0;
    this.funds = 0;
  }

  public String getName() {
    return this.name;
  }

  public int getVisitorNumbers() {
    return this.currentVisitors;
  }

  public int getfunds() {
    return this.funds;
  }

  public int getNumOfEscapedDinosaurs() {
    return escapedDinosaurs.size();
  }

  public String setName(String name) {
    return this.name = name;
  }

  public void setCurrentVisitors(int currentVisitors) {
    this.currentVisitors = currentVisitors;
  }

  public void addDinosaur(Dinosaur dinosaur) {  
    escapedDinosaurs.add(dinosaur);
  }

}