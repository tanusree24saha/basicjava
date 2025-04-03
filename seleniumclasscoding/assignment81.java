package seleniumclasscoding;

import java.util.Arrays;

public class assignment81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[3];
		
           arr1[0]=12;
           arr1[1]=56;
           arr1[2]=4;
           
           System.out.println("Before sorting the array is-->"+ Arrays.toString(arr1));
           Arrays.sort(arr1);
           System.out.println("After sorting the array is-->"+ Arrays.toString(arr1));
	}

}
