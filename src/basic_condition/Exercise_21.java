package basic_condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 21) Make an algorithm that reads a given year and shows whether or not it is
		 * LEAP.
		 */

		int year = 0;

		System.out.print("Type which year you want to know if it is a leap year : ");
		year = sc.nextInt();

		if (year % 4 == 0) {
			System.out.println("This year is a leap. ");
		} else {
			System.out.println("This year not is a leap. ");
		}

		sc.close();
	}

}
