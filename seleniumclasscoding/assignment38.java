package seleniumclasscoding;

import java.util.Scanner;

public class assignment38 {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter one side of rectangle: ");
		double side1 = scanner.nextDouble();

		System.out.print("Enter second side of rectangle: ");
		double side2 = scanner.nextDouble();

		double circumference = 2*(side1 + side2);
		System.out.println("The circumference of circle is " + circumference);
		scanner.close();
	}
}
