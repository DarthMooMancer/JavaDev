public class test {
  public static void main(String[] args) {
    int b = 10;
    String result = "";
    while (b < 100) {
      result += b;
      b *= 2;
    }
    System.out.println(result);
  }
}
