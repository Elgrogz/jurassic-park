package jurassic_park;
import java.util.*;

public class PopularityCalculator {

  int parkPopularity;

  public PopularityCalculator() {
    this.parkPopularity = 0;
  }

  public void addPopularity(int popularity) {
    this.parkPopularity += popularity;
  }

}