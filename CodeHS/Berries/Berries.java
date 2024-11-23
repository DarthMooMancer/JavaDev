import java.util.Scanner;

public class Berries {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter the initial of the berry: ");
      String get = input.nextLine();
      char response = get.charAt(0);

      if (response == 'E') {
        System.out.println("You ordered Elderberry");
      } else if (response == 'G') {
        System.out.println("You ordered Gooseberry");
      } else if (response == 'L') {
        System.out.println("You ordered Lingonberry");
      } else {
        System.out.println("Berry not recognized");
      }
    } finally {
      input.close();
    }
  }
}
