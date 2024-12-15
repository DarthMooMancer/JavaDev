public class Main {
  public static void main(String[] args) {
    System.out.println(someMethod(3, 1));
  }

  public static int someMethod(int x, int y) {
    int sum = 0;
    while (x < 10) {
      sum += x % y;
      x++;
      y++;
    }
    return sum;
  }
}
