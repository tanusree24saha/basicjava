package seleniumclasscoding;

public class assignment16 {

	public static void foo() {
		System.out.println("first static method called ");
	}

	public static void foo(int a) {
		System.out.println(a);
	}

	public void foo1() {
		System.out.println("first non static method called ");
	}

	public void foo1(int b) {
		System.out.println(b);
	}

	public static void main(String args[]) {
		foo();
		foo(10);
		assignment16 a1 = new assignment16();
         a1.foo1(23);
         a1.foo1();
	}

}
