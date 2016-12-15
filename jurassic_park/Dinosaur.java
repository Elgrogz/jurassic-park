abstract class Dinosaur {
  String name;
  String type;
  int foodLevel;
  int popularityLevel;

  public Dinosaur(String name, String type, int popularityLevel) {
    this.name = name;
    this.type = type;
    this.foodlevel = 5;
    this.popularityLevel = popularityLevel;
  }

  public String getName() {
    return this.name;
  }

  public String getType() {
    return this.type;
  }

  public int getFoodLevel() {
    return this.foodlevel;
  }

  public int getPopularityLevel() {
    return this.popularityLevel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
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
    setFoodLevel -= 1; 
  }

  public void checkFood() {
    if (this.foodLevel > 5) {
      this.foodLevel = 5;
    }
    else if (this.foodLevel < 0) {
      this.foodLevel = 0
    }
  }

  public void rampage() {

  }

}