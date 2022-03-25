package basic_condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 18) Make a program that reads a person's year of birth, calculates the age
		 * her and then show her whether or not she can vote.
		 */

		int currentYear = 2022;
		int personAge = 0;
		int yearBirth = 0;

		System.out.print("What year your birth? ");
		yearBirth = sc.nextInt();

		personAge = currentYear - yearBirth;

		System.out.println("You are " + personAge + " old.");

		if (personAge > 18) {
			System.out.println("You cant vote. ");
		} else {
			System.out.println("You not cant vote.");
		}
		sc.close();

	}

}
