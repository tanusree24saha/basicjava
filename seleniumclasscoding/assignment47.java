package seleniumclasscoding;

class Super4 {

	 void func1() {

		System.out.println("Overriden method");
	}
}

public class assignment47 extends Super4 {

	 void func1() {

		System.out.println("Overriding method");
		super.func1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment47 a1=new assignment47();
		 a1.func1();
	}

}
