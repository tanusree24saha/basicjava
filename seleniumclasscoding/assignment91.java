package seleniumclasscoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;




public class assignment91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> c1=new ArrayList<Integer>();
		c1.add(45);
		c1.add(23);
		c1.add(12);
		System.out.println(c1);
		
		Iterator<Integer> i1 = c1.iterator();
		System.out.println("FORWARD IERATION USING ITERATOR");
		while (i1.hasNext())  {


         System.out.println(i1.next());
	}

}
}