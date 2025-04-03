package seleniumclasscoding;

import java.util.ArrayList;
import java.util.Collection;


public class assignment90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(45);
		c1.add(23);
		c1.add(12);
		System.out.println(c1);
		c1.remove(23);
		System.out.println(c1);
		System.out.println(c1.contains(45));


	}

}
