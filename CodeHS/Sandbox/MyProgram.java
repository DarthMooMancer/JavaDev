import java.util.Scanner;
public class MyProgram {
  public static int random = (int)(Math.random() * 3 + 1);
  public static String computerGuess;
  public static String computer = guess();

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Rock, Paper, or Scissors");
    System.out.println("Enter guess as number");
    int user = input.nextInt();

    if(computer == "Rock" && user == 1) {
      System.out.println("Tied");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Paper" && user == 2) {
      System.out.println("Tied");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Scissor" && user == 3) {
      System.out.println("Tied");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Rock" && user == 2) {
      System.out.println("User wins");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Rock" && user == 3) {
      System.out.println("Computer Wins");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Paper" && user == 3) {
      System.out.println("Computer wins");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Paper" && user == 1) {
      System.out.println("User wins");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Scissors" && user == 2) {
      System.out.println("Computer wins");
      System.out.println("The Computer entered: " + computer);
    }
    else if(computer == "Scissors" && user == 1) {
      System.out.println("User wins");
      System.out.println("The Computer entered: " + computer);
    }
  }

  public static String guess() {
    if(random == 1) {
      computerGuess = "Rock";
      return computerGuess;
    }
    else if(random == 2) {
      computerGuess = "Scissors";
      return computerGuess;
    }
    else {
      computerGuess = "Paper";
      return computerGuess;
    }
  }
}
