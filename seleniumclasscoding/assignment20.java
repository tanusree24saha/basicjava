package seleniumclasscoding;

public class assignment20 {

	assignment20() {

		System.out.println("the non -arg constructor called");
	}

	assignment20(double a, double b) {

		System.out.println("the parameterized constructor called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new assignment20();

		new assignment20(23.7, 12.3);

	}

}
