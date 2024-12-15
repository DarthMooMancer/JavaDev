public class stepTracker {
  private int min = 0;
  private int total = 0;
  private int active = 0;
  private int totaldays = 0;

  public stepTracker(int m) {
    min = m;
  }

  public int addDailySteps(int s) {
    if(s >= min) {
      active++;
    }
    totaldays++;
    return total += s;
  }

  public int activeDays() {
    return active;
  }

  public int averageSteps() {
    return total / totaldays;
  }
}
