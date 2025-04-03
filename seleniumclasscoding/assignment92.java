package seleniumclasscoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;




public class assignment92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> c1=new ArrayList<String>();
		c1.add("tanu");
		c1.add("subha");
		c1.add("sandesh");
		System.out.println(c1);
		
		Iterator<String> i1 = c1.iterator();
		System.out.println("FORWARD IERATION USING ITERATOR");
		while (i1.hasNext())  {


         System.out.println(i1.next());
	}

}
}