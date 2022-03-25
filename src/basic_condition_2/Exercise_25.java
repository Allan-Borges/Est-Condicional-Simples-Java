package basic_condition_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * 25) [CHALLENGE] Create a program that reads the length of three line
		 * segments. Analyze their lengths and say if it is possible to form a triangle
		 * with these straight. Mathematically, for three segments to form a triangle,
		 * the length on each side must be less than the sum of the other two.
		 */

		double lineSegment1 = 0.0;
		double lineSegment2 = 0.0;
		double lineSegment3 = 0.0;

		System.out.print("What is the segment of the first line in cm? ");
		lineSegment1 = sc.nextDouble();

		System.out.print("What is the segment of the second line in cm? ");
		lineSegment2 = sc.nextDouble();

		System.out.print("What is the segment of the third line in cm? ");
		lineSegment3 = sc.nextDouble();

		if (lineSegment1 < lineSegment2 + lineSegment3 && lineSegment2 < lineSegment1 + lineSegment3
				&& lineSegment3 < lineSegment2 + lineSegment1) {
			System.out.println("It is possible to form a triangle. ");
		} else {
			System.out.println("It is not possible to form a triangel. ");
		}

		sc.close();
	}

}
