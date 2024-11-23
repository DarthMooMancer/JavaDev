public class Replace {
  public static void main(String[] args) {
    String test = replaceLetter("hannah", "n", "o");
    System.out.println(test);
  }

  public static String replaceLetter(String m, String o, String n) {
    String out = "";
    int x = 0;
    int y = 1;

    for (int i = m.length(); i > 0; i--) {
      String s = m.substring(x, y);
      if (s.equals(o)) {
        out += n;
      } else {
        out += s;
      }
      x++;
      y++;
    }
    return out;
  }
}
