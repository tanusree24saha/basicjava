package seleniumclasscoding;

import java.util.Scanner;

public class assignment33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter height of triangle: ");
		double height = scanner.nextDouble();
		System.out.print("Enter base of triangle: ");
		double base = scanner.nextDouble();

		double area = (base * height)/2;
		System.out.println("The area of triangle is " + area);
		scanner.close();
	}

}