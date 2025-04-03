package seleniumclasscoding;

class Super2{
	
	Super2(int a,int b){
		System.out.println("parametrized parent class constructor");
	}
}


public class assignment44  extends 	Super2{

	           assignment44(){
	        	   super(12,4);
	        	   System.out.println("child class constructor");
	           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              new assignment44();
	}

}
