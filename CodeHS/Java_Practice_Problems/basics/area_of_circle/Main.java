public class Main {
  public static void main(String[] args) {
    System.out.println(getArea(9));
  }

  public static double getArea(double radius) {
    double x = (Math.PI * radius * radius) * 100;
    double y = Math.round(x);
    double z = y / 100;
    return z;
  }
}
