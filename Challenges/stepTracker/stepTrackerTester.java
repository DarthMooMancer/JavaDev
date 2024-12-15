public class stepTrackerTester {
  public static void main(String[] args) {
    stepTracker tf = new stepTracker(10000);
    tf.addDailySteps(10000);
    System.out.println(tf.activeDays());
    tf.addDailySteps(4000);
    System.out.println(tf.activeDays());
    System.out.println(tf.averageSteps());
  }
}
