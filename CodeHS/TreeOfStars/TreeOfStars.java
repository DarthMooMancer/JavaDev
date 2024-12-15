public class TreeOfStars {
  public static void main(String[] args) {
    makeATree();
  }

  public static void makeATree() {
    String space = " ";
    String get = "";
    for (int i = 0; i <= 9; i++) {
      for (int j = 1; j <= 9 - i; j++) {
        System.out.print("* "); 
      }
      for (int x = 0; x < 1; x++) {
        get += space;
      }
      System.out.print("\n" + get);
    }
  }
}
