package seleniumclasscoding;

public class assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 20;

		if ((a < b) && (b == c)) {

			System.out.println("a is less than b and b is equal to c");
		}

		else {
			System.out.println("a is not less than b and b is not equal to c");

		}

		
		if ((a < b) || (b == c)) {

			System.out.println("a is less than b or  b is equal to c");
		}

		else {
			System.out.println("a is not less than b and b is not equal to c");

		}

		if (!((a < b) && (b == c))) {

			System.out.println("a is less than b and b is equal to c");
		}

		else {
			System.out.println("a is not less than b and b is not equal to c");

		}
		if (!((a < b) || (b == c))) {

			System.out.println("a is less than b and b is equal to c");
		}

		else {
			System.out.println("a is not less than b and b is not equal to c");

		}


	}
}
