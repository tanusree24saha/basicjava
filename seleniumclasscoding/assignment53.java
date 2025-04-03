 package seleniumclasscoding;
 
interface Walkable { 
	void walk(); 
} 

interface Swimmable { 
	void swim(); 
} 

// Implement the interfaces in a class 
class assignment53 implements Walkable, Swimmable { 
	public void walk() 
	{ 
		System.out.println("Duck is walking."); 
	} 

	public void swim() 
	{ 
		System.out.println("Duck is swimming."); 
	} 



	public static void main(String[] args) 
	{ 
		assignment53 duck = new assignment53(); 
		duck.walk(); 
		duck.swim(); 
	} 
}
