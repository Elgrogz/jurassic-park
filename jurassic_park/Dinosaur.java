package jurassic_park;

public abstract class Dinosaur {

  String name;
  int foodLevel;
  int popularityLevel;

  public Dinosaur(String name) {
    this.name = name;
    this.foodLevel = 5;
    this.popularityLevel = popularityLevel;
  }

  public String getName() {
    return this.name;
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
    checkFood();
  }

  public void setPopularityLevel(int popularityLevel) {
    this.popularityLevel = popularityLevel;
  }

  public void eat() {
    setFoodLevel(5);
  }

  public void takeACrap() {
    this.foodLevel -= 1; 
  }

  public void checkFood() {
    if (this.foodLevel > 5) {
      this.foodLevel = 5;
    }
    else if (this.foodLevel < 1) {
      this.foodLevel = 0;
      rampage();
    }
  }

  public void rampage() {

  }

}