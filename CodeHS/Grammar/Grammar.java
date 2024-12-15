import java.util.Scanner;

public class Grammar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println(useProperGrammar("Go to the store"));
    } finally {
      input.close();
    }
  }

  public static String useProperGrammar(String m) {
    int seen = 0;
    String out = "";
    for (int i = 0; i < m.length(); i++) {
      String s = m.substring(i, i + 1);
      if (s.equals("2")) {
        seen += 1;
        out += "to";
      } else {
        out += s;
      }
    }
    System.out.println("Fixed " + seen + " grammatical errors:");
    return out;
  }
}
