package seleniumclasscoding;

// Base or Super Class
class parentclass {
	static void func1() {

		System.out.println("this is parent class function");

	}

}

// Inherited or Sub Class
class assignment40 extends parentclass {
	static void func2() {

		System.out.println("this is sub class function");

	}

	public static void main(String args[]) {
               func1();
               func2();
	}
}