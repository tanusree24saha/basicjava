package seleniumclasscoding;

import java.util.Scanner;

public class assignment37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter one side of rectangle: ");
		double side1 = scanner.nextDouble();
	
		System.out.print("Enter second side of rectangle: ");
		double side2 = scanner.nextDouble();
		
		double area = side1 * side2;
		System.out.println("The area of square is " + area);
		scanner.close();
	}
}
