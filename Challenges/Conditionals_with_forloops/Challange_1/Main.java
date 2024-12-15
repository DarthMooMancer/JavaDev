import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter First (lowest) number"); 
      int num1 = input.nextInt();

      System.out.println("Enter Second (hightest) number"); 
      int num2 = input.nextInt();

      System.out.println("There are " + evens(num1, num2) + " even numbers between " + num1 + " and " + num2 + "."); 
    } finally {
      input.close();
    }
  }

  public static int evens(int a, int b) {
    int z = 0;
    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) {
        z++;
      }
    }
    return z;
  }
}
