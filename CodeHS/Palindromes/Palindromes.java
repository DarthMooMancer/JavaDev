import java.util.Scanner;

public class Palindromes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter word: ");
      String s = input.nextLine();
      System.out.println(isPalindrome(s));
      System.out.println(reverse(s));
    } finally {
      input.close();
    }
  }

  public static boolean isPalindrome(String text) {
    text = text.toLowerCase();
    String rev = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      rev = rev + text.charAt(i);
    }
    boolean res = text.equals(rev);
    if (res) {
      return true;
    } else {
      return false;
    }
  }
  public static String reverse(String text) {
    text = text.toLowerCase();
    String rev = "";
    for (int i = text.length() - 1; i >= 0; i--) {
      rev = rev + text.charAt(i);
    }
    return rev;
  }
}
