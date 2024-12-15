import java.util.Scanner;

public class Letter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Enter your word: ");
      String word = input.nextLine();

      System.out.println("Enter your letter to replace: ");
      String letter = input.nextLine();

      System.out.println("Enter your replacement: ");
      String replacement = input.nextLine();

      System.out.println(replaceLetter(word, letter, replacement));
    } finally {
      input.close();
    }
  }

  public static String replaceLetter(String m, String o, String n) {
    String out = "";
    int x = 0;
    int firstInstance = 0;
    for (int i = m.length(); i > 0; i--) {
      String s = m.substring(x, x + 1);
      if (firstInstance == 0 && s.equals(o)) {
        firstInstance++;
        out += s;
      } else if (s.equals(o)) {
        out += n;
      } else {
        out += s;
      }
      x++;
    }
    return out;
  }
}
