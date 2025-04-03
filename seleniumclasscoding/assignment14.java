package seleniumclasscoding;

public class assignment14 {

	void add(int a, int b) {

		int c = a + b;

		System.out.println(c);

	}

	void sub(int a, int b) {

		int c = a - b;

		System.out.println(c);

	}

	void mul(int a, int b) {

		int c = a * b;

		System.out.println(c);

	}

	void div(int a, int b) {

		int c = a / b;

		System.out.println(c);

	}

	public static void main(String[] args) {

		assignment14 a1= new assignment14();
		a1.add(12, 56);
		a1.sub(45, 12);
		a1.mul(3, 4);
		a1.div(12,2);

	}

}
