import java.util.Scanner;

public class Divisibility {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter the dividend: ");
      int x = input.nextInt();
      System.out.println("Enter the divisor: ");
      int y = input.nextInt();

      if (y == 0) {
        System.out.println(x + " is not divisible by 0!");
      } else if (x % y == 0 && y != 0) {
        System.out.println(x + " is divisible by " + y + "!");
      } else {
        System.out.println(x + " is not divisible by " + y + "!");
      }
    } finally {
      input.close();
    }
  }
}
