import java.util.Scanner;

public class TaffyTester {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Starting Taffy Timer...");
      while (true) {
        System.out.println("Enter the temperature: ");
        int usertemp = input.nextInt();
        if (usertemp < 270) {
          System.out.println("The mixture isn't ready yet.");
        } else if (usertemp >= 270) {
          System.out.println("Your taffy is ready for the next step!");
          break;
        }
      }
    } finally {
      input.close();
    }
  }
}
