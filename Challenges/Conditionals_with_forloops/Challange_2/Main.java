import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter number to check its prime status: ");
      int num = input.nextInt();
      System.out.println("Your number's prime status is: " + prime(num));
    } finally {
      input.close();
    }
  }

  public static boolean prime(int number) {
    if (number <= 1) {
      return false;
    } for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }
}
