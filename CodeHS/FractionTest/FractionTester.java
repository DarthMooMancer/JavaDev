import java.util.Scanner;

public class FractionTester {
  static Fraction test = new Fraction(1, 2);

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the numerator: ");
    int num = input.nextInt();

    System.out.println("Enter the denominator: ");
    int den = input.nextInt();

    computeFraction(num, den);
  }
 
  public static int __gcd(int a, int b) {
      if (b == 0) 
          return a; 
      return __gcd(b, a % b); 
       
  }

  public static void reduceFraction(int x, int y) {
      int d; 
      d = __gcd(x, y); 
   
      x = x / d; 
      y = y / d; 
   
      System.out.println("x = " + x + ", y = " + y); 
  } 
 
  public static int computeFraction(int num, int den) {
      if (den == 0) {
          System.out.println("Denominator cannot be zero.");
          return -1; // Indicate error
      }

      Fraction user = new Fraction(num, den);
      
      int commonDenominator = test.getDenominator() * den;
      int addedNum = num * test.getDenominator() + test.getNumerator() * den;

      Fraction added = new Fraction(addedNum, commonDenominator);

      // Always reduce the result
      reduceFraction(added.getNumerator(), added.getDenominator());

      return 0;
  }
}
