package seleniumclasscoding;

public class assignment22 {
    public static int a = 23;
    public  int b = 44;
    
    public static void func1() {
    	
    	assignment22 a1=new assignment22();
    	System.out.println(assignment22.a);
    	System.out.println(a1.b);
    }
    
   public  void func2() {
    	
		assignment22 a2=new assignment22();
    	System.out.println(assignment22.a);
    	System.out.println(a2.b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          func1();
          assignment22 a2=new assignment22();
          a2.func2();
          
          
	}

}
