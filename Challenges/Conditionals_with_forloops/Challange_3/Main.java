import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter a number to be divided by 3: ");
      int num = input.nextInt();
      ifDivisible(num);
    } finally {
      input.close();
    }
  }

  public static void ifDivisible(int x) {
    int y = 0;
    int rem = 0;
    if (x % 3 == 0) {
      for (int i = 0; i <= x; i++) {
        y += i;
      }
      y += x;
    } else if (x % 3 == 1) {
      rem ++;
      for (int i = 1; i <= x; i++) {
        y += i;
      }
      y += x;
    } else if (x % 3 == 2) {
      rem += 2;
      for (int i = 2; i <= x; i++) {
        y += i;
      }
      y += x;
    } else {
      System.out.println("Number not accepted for result");
    }
    System.out.println("Since your input had a remainder of " + rem + " when divided by three, the result of the program is " + y);
  }
}
