public class Feeder {
  private int currentFood;

  public Feeder() {
    currentFood = 1000;
  }

  public void simulateOneDay(int numBirds) {
    int gpb = (int)(Math.random() * 50 + 10);
    int percent = (int)(Math.random() * 100 + 1);


    if(percent >= 95) {
      currentFood = 0;
    } else {
      currentFood -= numBirds * gpb;
    }

    if (currentFood < 0) {
      currentFood = 0;
    }
  }
}
