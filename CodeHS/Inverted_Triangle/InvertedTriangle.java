public class InvertedTriangle {
  public static void main(String[] args) {
    makeInvertedTriangle();
  }

  public static void makeInvertedTriangle() {
    for (int i = 0; i <= 6; i++) {
      for (int j = 1; j <= 7 - i; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
