import java.util.Scanner;

public class ThreeStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      String companyCode = "1298";
      System.out.println("Enter your password: ");
      String password = input.nextLine();

      System.out.println("Enter your company's secret code: ");
      String secretCodeEntry = input.nextLine();

      if (password.equals(password)) {
        if (secretCodeEntry.equals(companyCode)) {
          System.out.println("Access granted");
        } else {
          System.out.println(password + secretCodeEntry + " is denied");
        }
      } else {
        System.out.println(password + secretCodeEntry + " is denied");
      }
    } finally {
      input.close();
    }
  }
}

