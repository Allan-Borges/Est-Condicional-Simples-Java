package basic_condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 19) Create an algorithm that reads a student's name and two grades,
		 * calculates his average and show on screen. At the end, analyze the average
		 * and show whether the student had or not a good performance (if it was above
		 * average 7.0).
		 */

		String name;
		double note1 = 0.0;
		double note2 = 0.0;
		double average = 0.0;

		System.out.print("What is your name? ");
		name = sc.nextLine();

		System.out.print("What is your first note? ");
		note1 = sc.nextDouble();

		System.out.print("What is your second note? ");
		note2 = sc.nextDouble();

		average = (note1 + note2) / 2;

		System.out.println("Your average and: " + average);

		if (average > 7.0) {
			System.out.println("Congratulations " + name + " Your had a good performance!!");
		}

		sc.close();
	}

}
