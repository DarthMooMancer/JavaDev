public class NumberTriangle {
  public static void main(String[] args) {
    makeNumberTriangle();
  }

  public static void makeNumberTriangle() {
    for (int i = 1; i <= 5; i++) {
      for (int x = 1; x <= i; x++) {
        System.out.print(x + " ");
      }
      System.out.println();
    }
  }
}
