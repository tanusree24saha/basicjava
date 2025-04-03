package seleniumclasscoding;

import java.util.Scanner;

public class assignment34 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter side1 of triangle: ");
	double side1 = scanner.nextDouble();
	System.out.print("Enter side2 of triangle: ");
	double side2 = scanner.nextDouble();
	System.out.print("Enter side3 of triangle: ");
	double side3 = scanner.nextDouble();

	
	double circumference = side1 + side2 + side3;
	System.out.println("The circumference of triangle is " + circumference);
	scanner.close();
	
	
	}
}
