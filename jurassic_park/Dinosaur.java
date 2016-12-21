package jurassic_park;

public abstract class Dinosaur {

  String name;
  DinosaurTypes type;
  int foodLevel;
  int popularityLevel;


  public Dinosaur(String name) {
    this.name = name;
    this.type = type;
    this.foodLevel = 5;
    this.popularityLevel = popularityLevel;
  }

  public String getName() {
    return this.name;
  } 

  public String getType() {
    return this.type.toString();
  } 

  public int getFoodLevel() {
    return this.foodLevel;
  }

  public int getPopularityLevel() {
    return this.popularityLevel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFoodLevel(int foodLevel) {
    this.foodLevel = foodLevel;
  }

  public void setPopularityLevel(int popularityLevel) {
    this.popularityLevel = popularityLevel;
  }

  public void eat() {
    setFoodLevel(5);
  }

  public void takeACrap() {
    this.foodLevel -= 1; 
    checkFood();
  }

  public String checkFood() {
    if (this.foodLevel > 5) {
      this.foodLevel = 5;
      return "Not starving";
    }
    else if (this.foodLevel < 1) {
      this.foodLevel = 0;
      return "Dinosaur starving";
    }
    return null;
  }

  public String info() {
    return "Name: " + getName() + ", Current Food Level: " + getFoodLevel();
  }

}