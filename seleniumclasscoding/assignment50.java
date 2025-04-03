package seleniumclasscoding;

abstract class abstract_2 {
	public abstract void func2();
    public void add() {
    	
    	int a=12;
    	int b=23;
    	System.out.println(a+b);
    }
}

public class assignment50 extends abstract_2{
          public void func2() {
            	 
            	 System.out.println("Hi func1");
             }
	public static void main(String[] args) {
           
		assignment50 a2= new assignment50();
		a2.func2();
		a2.add();
	}

}
