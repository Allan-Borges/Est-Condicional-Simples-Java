package basic_condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 22) Write a program that reads a boy's year of birth and shows his situation
		 * regarding military enlistment. - If you are before the age of 18, show how
		 * many years are left for the enlistment. - If you are over 18, show how many
		 * years have passed since enlistment
		 */

		int currentYear = 0;
		int year = 0;
		int yearBirth = 0;
		
		System.out.print("What year were you born? ");
		yearBirth = sc.nextInt();
		System.out.print("What current year? ");
		currentYear = sc.nextInt();

		year = currentYear - yearBirth;

		if (year < 18) {
			int yearGo = 18 - year;
			System.out.println("MIssiing " + yearGo + " years.");
		} else {
			int yearPassed = year - 18;
			System.out.println("Passed " + yearPassed + " years.");
		}

		sc.close();
	}

}
