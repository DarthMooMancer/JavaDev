import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      int comp = (int) (Math.random() * 101 + 1);
      int guessNum = 0;
      int x = 1;
      while (x != 0) {
        System.out.println("Enter your guess: ");
        int user = input.nextInt();
        if (user > comp) {
          System.out.println("Too high");
          guessNum++;
        } else if (user < comp) {
          System.out.println("Too low");
          guessNum++;
        } else if (user == comp) {
          System.out.println("You got it! It tokk you " + guessNum + " guesses");
          break;
        } else {
          System.out.println("An error occured");
        }
      }
    } finally {
      input.close();
    }
  }
}
