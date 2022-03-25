package basic_condition_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 23) In an exclusive promotion for Women's Day, a store wants to give
		 * discounts for everyone, but especially for women. Make a program that reads
		 * name, gender and the value of the customer's purchases and calculate the
		 * discounted price. Knowing what: - Men get 5% off - Women get 13% off
		 */

		String name = "";
		double price = 0.0;
		double descountPrice = 0.0;

		System.out.print("What is your name? ");
		name = sc.nextLine();

		System.out.print("What is your sex (f) ou (m)? ");
		char sex = sc.next().charAt(0);

		System.out.print("what is the purchase price: ");
		price = sc.nextDouble();

		if (sex == 'f') {
			descountPrice = (price * 15) / 100 + price;
			System.out.printf(name + " the value of the purchase with a discount for women and $%.2f", descountPrice);
		} else {
			descountPrice = (price * 3) / 100 + price;
			System.out.printf(name + " the value of the purchase with a discount for men and $%.2f", descountPrice);
		}

		sc.close();
	}

}
