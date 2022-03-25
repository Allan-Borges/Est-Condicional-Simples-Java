package basic_condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 20) Develop a program that reads an integer and shows whether it is PAR or
		 * ODD.
		 */

		int number = 0;

		System.out.print("Enter a number integer : ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("This number is even. ");
		} else {
			System.out.println("This number is odd. ");
		}

		sc.close();
	}

}
