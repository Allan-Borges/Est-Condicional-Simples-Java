package basic_condition_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_24 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 24) Make a wish that asks how far a passenger wants to travel in Km.
		 * Calculate the price of the ticket, charging R$0.50 per Km for trips up to
		 * 200Km and R$0.45 for longer trips.
		 */

		double travelDistance = 0.0;
		double ticketPrice = 0.0;

		System.out.print("How far do you want to go ? ");
		travelDistance = sc.nextDouble();

		if (travelDistance <= 200) {
			ticketPrice = travelDistance * 0.50;
			System.out.printf("The ticket price will cost :$%.2f", ticketPrice);
		} else {
			ticketPrice = travelDistance * 0.45;
			System.out.printf("The ticket price will cost :$%.2f", ticketPrice);
		}

		sc.close();
	}

}
