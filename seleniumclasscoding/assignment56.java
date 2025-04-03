package seleniumclasscoding;

class parent12 {
	public void add() {

		int a = 12;
		int b = 23;
		int c = a + b;
		System.out.println(c);
	}

	protected void sub() {

		int a = 12;
		int b = 23;
		int c = b - a;
		System.out.println(c);
	}
	
	 void mul() {

		int a = 12;
		int b = 23;
		int c = b * a;
		System.out.println(c);
	}
	 
	private  void div() {

			int a = 12;
			int b = 23;
			int c = b / a;
			System.out.println(c);
		}
}

public class assignment56   {

	public void sub() {

		int a = 12;
		int b = 23;
		int c = b - a;
		System.out.println(c);
	}

	public static void main(String[] args) {
		assignment55 a1 = new assignment55();
		a1.add();
		a1.sub();
		a1.mul();
		//a1.div();//as private method div() so giving compile time error

	}

}
