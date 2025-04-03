package seleniumclasscoding;

class Super1{
	
	Super1(){
		System.out.println("non parametrized parent class constructor");
	}
}


public class assignment43 extends 	Super1{

	           assignment43(){
	        	   super();
	        	   System.out.println("non parametrized child class constructor");
	           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              new assignment43();
	}

}
