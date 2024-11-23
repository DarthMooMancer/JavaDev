import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter a number: ");
      int num = input.nextInt();
      if (num > 0) {
        System.out.println("The number is positive!");
      } else if (num < 0) {
        System.out.println("The number is negative!");
      } else {
        System.out.println("The number is neither positive nor negative!");
      }
    } finally {
      input.close();
    }
  }
}
