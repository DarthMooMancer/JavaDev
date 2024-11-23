import java.util.Scanner;

public class GuessTheNumber {
  static int everestHeight = 8848;

  public static void main(String[] args) {
    System.out.println("Do you know how tall Mt. Everest is?");
    System.out.println("See if you can guess the height in meters.");
    guessTheHeight();
  }

  public static void guessTheHeight() {
    Scanner input = new Scanner(System.in);
    try {
      while (true) {
        System.out.println("Guess the height: ");
        int guess = input.nextInt();
        if (guess < everestHeight || guess > everestHeight) {
          System.out.println("That's not it!");
        } else if (guess == everestHeight) {
          System.out.println("Right! Mt. Everest is 8848 meters tall!");
          break;
        }
      }
    } finally {
      input.close();
    }
  }
}
