package seleniumclasscoding;

import java.util.Scanner;

public class assignment31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter radius of circle: ");
		int radius = scanner.nextInt();
		double area = Math.PI*radius*radius;
		System.out.println(area);
		scanner.close();



	}

}
