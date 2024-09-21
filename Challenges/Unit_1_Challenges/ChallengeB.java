// Owner Andrew Haynes - Partner Sam Potter
import java.util.Scanner;

public class ChallengeB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Get Input for date of birth
		System.out.println("Enter the month you were born (as a number) -> ");
		int month = input.nextInt();
		System.out.println("Enter the day you were born -> ");
		int day = input.nextInt();
		System.out.println("Enter the year you were born -> ");
		int year = input.nextInt();
		
		//getBirthMonth();
		// This is the current day being the due date of the project 9/23/24
		int currentMonth = 9;
		int currentDay = 23;
		int currentYear = 2024; 
		
		boolean getMonth = true;
		// These are the current times - birth times

		//int birthMonth = currentMonth - month;
		int birthYear = currentYear - year;
		String birthMonth = getBirthMonth(month);
		System.out.println(birthMonth);
	}

	public static String getBirthMonth(int month) { // Get Birth month based on number put in 
		String birthMonth;
		boolean getMonth = true;
		while(getMonth) {
			if(month == 1) {
				birthMonth = "January";
				getMonth = false;
			}
			else if(month == 2) {
				birthMonth = "February";
				getMonth = false;
			}
			else if(month == 3) {
				birthMonth = "March";
				getMonth = false;
			}
			else if(month == 4) {
				birthMonth = "April";
				getMonth = false;
			}
			else if(month == 5) {
				birthMonth = "May";
				getMonth = false;
			}
			else if(month == 6) {
				birthMonth = "June";
				getMonth = false;
			}
			else if(month == 7) {
				birthMonth = "July";
				getMonth = false;
			}
			else if(month == 8) {
				birthMonth = "August";
				getMonth = false;
			}
			else if(month == 9) {
				birthMonth = "September";
				getMonth = false;
			}
			else if(month == 10) {
				birthMonth = "October";
				getMonth = false;
			}
			else if(month == 11) {
				birthMonth = "November";
				getMonth = false;
			}
			else if(month == 12) {
				birthMonth = "December";
				getMonth = false;
			}
			else { 
				System.out.println("Invalid number for month");
			}
		}
		return birthMonth;
	}
}

