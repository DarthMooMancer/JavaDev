import java.util.Scanner;

public class RollerCoaster {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter your height: ");
      int height = input.nextInt();
      System.out.println("Enter your age: ");
      int age = input.nextInt();
      if (height >= 42 && age >= 9) {
        System.out.println("Welcome aboard!");
      } else {
        System.out.println("Sorry, you are not eligible to ride");
      }

    } finally {
      input.close();
    }
  }
}
