public class RaterTesting {
  public static void main(String[] args) {
    Rater test = new Rater("Andrew's Company", 2);
    test.updateReview();
    System.out.println(test.toString());
    test.setRating(4);
    test.updateReview();
    System.out.println(test.toString());
  }
}
