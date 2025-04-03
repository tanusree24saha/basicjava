package seleniumclasscoding;

import java.util.Arrays;

public class assignment83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="ear";
       String b="are";
       
       if(a.length()!=b.length()) {
    	   
    	   System.out.println("They are not anagram");
    	   
       }
    	
       else {
    	   System.out.println("ok the two strings length is same");
    	   
       }
       char c1[]=a.toCharArray();
       char c2[]=b.toCharArray();
       System.out.println("Before sorting"+ Arrays.toString(c1));
       System.out.println("Before sorting"+ Arrays.toString(c2));
       Arrays.sort(c2);
       Arrays.sort(c1);
       System.out.println("After sorting"+ Arrays.toString(c1));
       System.out.println("After sorting"+ Arrays.toString(c2));

       if(Arrays.equals(c1, c2)) {
    	   
    	   System.out.println("anagram");
    	   
    	   
       }
       else {
    	   
    	   System.out.println("anagram");
    	   
    	   
       }
	}

}
