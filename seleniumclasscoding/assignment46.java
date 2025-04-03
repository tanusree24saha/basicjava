package seleniumclasscoding;

class Super3 {

	 void func1() {

		System.out.println("Overriden method");
	}
}

public class assignment46 extends Super3 {

	 void func1() {

		System.out.println("Overriding method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment46 a1=new assignment46();
		 a1.func1();
	}

}
