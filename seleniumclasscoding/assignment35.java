package seleniumclasscoding;

import java.util.Scanner;

public class assignment35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter side of square: ");
		double side = scanner.nextDouble();
	

		double area = side * side;
		System.out.println("The area of square is " + area);
		scanner.close();
	}

}