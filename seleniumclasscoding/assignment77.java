package seleniumclasscoding;

import java.util.Arrays;
import java.util.Scanner;

public class assignment77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=c.nextInt();
		boolean[] barray=new boolean[size];
		
		for (int i=0;i<=barray.length-1;i++) {
			
			System.out.println("Enter the value of the array for boolean values"+ i);
			barray[i]=c.nextBoolean();
		}
		System.out.println("The Array is-->"+Arrays.toString(barray));
        
	}

}
