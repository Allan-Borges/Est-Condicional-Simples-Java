package basic_condition;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 17) Write a program that asks the speed of a car. In case it exceeds 80Km/h,
		 * display a message saying that the user has been fined. In that case, display
		 * the amount of the fine, charging R$5 for each km above the permitted speed.
		 */

		double finedValue = 0;
		int carVelocity = 0;

		System.out.print("What is speed of the car? ");
		carVelocity = sc.nextInt();

		if (carVelocity > 80) {
			System.out.println("You wered fined!!!");
			finedValue = (carVelocity - 80) * 5;
		}
		System.out.printf("The amount of the fine is: $%.2f", finedValue);

		sc.close();

	}

}
