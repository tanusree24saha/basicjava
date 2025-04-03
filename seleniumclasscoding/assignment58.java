package seleniumclasscoding;

import ab1.parent2;

public class assignment58 extends parent2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment57 a2= new assignment57();
		a2.add();
		a2.sub();//compile time error as this func access specifier is protected and this is from the another package and not of parent class also
	}

}
