import java.util.Scanner;

public class FindMedian {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter the first integer: ");
      int x = input.nextInt();

      System.out.println("Enter the second integer: ");
      int y = input.nextInt();

      System.out.println("Enter the third integer: ");
      int z = input.nextInt();

      int median;
      if ((x >= y && x <= z) || (x <= y && x >= z)) {
          median = x;
      } else if ((y >= x && y <= z) || (y <= x && y >= z)) {
          median = y;
      } else {
          median = z;
      }
      System.out.println("The median is " + median);
    } finally {
      input.close();
    }
  }
}
