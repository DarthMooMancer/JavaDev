import java.util.Scanner;

public class MaxMin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter a number or 0 to quit: ");
      int num = input.nextInt();
      int smallest = num;
      int largest = num;

      while (num != 0) {
        System.out.println("Results so far: ");
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        num = input.nextInt();

        if (num < smallest) {
          smallest = num;
        }
        if (num > largest) {
          largest = num;
        }
      }
    } finally {
      input.close();
    }
  }
}
