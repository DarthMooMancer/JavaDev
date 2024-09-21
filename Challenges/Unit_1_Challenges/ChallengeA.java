// Owner Andrew Haynes - Partner Sam Potter
import java.util.Scanner;

public class ChallengeA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to reverse -> ");
		int num = input.nextInt();
		String result = "";
		while(num != 0) {
			String lastDigit = Integer.toString(num % 10);
			result = result + lastDigit;
			num /= 10;
		}
		System.out.println(result);
	}
}
