import java.util.Scanner;

public class Basketball {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter player one's name: ");
      String personOne = input.nextLine();
      System.out.println("Enter player two's name: ");
      String personTwo = input.nextLine();
      System.out.println("Enter " + personOne + "'s score");
      int personOneScore = input.nextInt();
      System.out.println("Enter " + personTwo + "'s score");
      int personTwoScore = input.nextInt();

      if (personOne.compareTo(personTwo) < 0) {
        System.out.println(personOne + " scored " + personOneScore + " points");
        System.out.println(personTwo + " scored " + personTwoScore + " points");
      } else {
        System.out.println(personTwo + " scored " + personTwoScore + " points");
        System.out.println(personOne + " scored " + personOneScore + " points");
      }

      if (personOneScore > personTwoScore) {
        System.out.println(personOne + " wins!");
      } else if (personOneScore < personTwoScore) {
        System.out.println(personTwo + " wins!");
      } else {
        System.out.println("Tied game!");
      }

    } finally {
      input.close();
    }
  }
}
