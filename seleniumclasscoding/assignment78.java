package seleniumclasscoding;

import java.util.Arrays;
import java.util.Scanner;

public class assignment78 {


public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int []array = new int[size];
	int []array1 = new int[array.length];
	
	for(int i = 0;i<=size-1; i++)
	{
        System.out.println("Enter the value at index position of first array->" + i );

		array[i]=sc.nextInt();
			

	
        System.out.println("Enter the value at index position of second array->" + i );

		array1[i]=sc.nextInt();
		
		
	}
	
    System.out.println("first array"+ Arrays.toString(array));
    System.out.println("second array"+ Arrays.toString(array1));
         
    boolean b=Arrays.equals(array, array1);
         
    if(b==true) {
    	 
    	 System.out.println("true");
     }
     
    else {
    	 System.out.println("false");
     }
	}

}
