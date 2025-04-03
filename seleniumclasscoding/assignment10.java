package seleniumclasscoding;

import java.util.Scanner;

public class assignment10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for their age
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// Check if the user is eligible to vote
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

	}

}
