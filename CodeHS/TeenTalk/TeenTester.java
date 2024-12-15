import java.util.Scanner;

public class TeenTester {
  public static void main(String[] args) {
    Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
    System.out.println(myFriend.teenTalk("Hello! Welcome! Come on in."));
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter a text: ");
      String take = input.nextLine();
      System.out.println("\nThe modified text would be: ");
      System.out.println(myFriend.teenTalk(take));
    } finally {
      input.close();
    }
  }
}
