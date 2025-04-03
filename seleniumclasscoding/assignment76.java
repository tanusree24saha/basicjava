package seleniumclasscoding;

import java.util.Scanner;

public class assignment76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int[] arr=new int[4];
		Scanner s1=new Scanner(System.in);
		double avg = 0;
		double sum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter array value at index pos "+ i);
			arr[i]=s1.nextInt();
			
			sum=sum+arr[i];
			avg=sum/arr.length;
		//	System.out.println("The average of the array values is"+ avg);
		}
         System.out.println("The average of the array values is "+ avg);
	}

}
