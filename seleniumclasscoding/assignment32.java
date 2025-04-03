package seleniumclasscoding;

import java.util.Scanner;

public class assignment32 {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter radius of circle: ");
		int radius = scanner.nextInt();
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of circle is " + circumference);
		scanner.close();

	}

}

