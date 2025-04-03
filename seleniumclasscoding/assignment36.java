package seleniumclasscoding;

import java.util.Scanner;

public class assignment36 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter side of square: ");
		double side = scanner.nextDouble();

		double circumference = 4 * side;
		System.out.println("The area of triangle is " + circumference);
		scanner.close();

	}
}
