package seleniumclasscoding;

import java.util.Arrays;
import java.util.Scanner;

public class assignment80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the input array");
		int size = sc.nextInt();
		int[] array = new int[size];
		int[] array1 = new int[array.length];

		for (int i = 0; i <= size - 1; i++) {
			System.out.println("Enter the value at index position of the input array->" + i);

			array[i] = sc.nextInt();
		}
		System.out.println("Enter the input array value" + Arrays.toString(array));

		//for (int i = 0; i <=array.length-1; i++) {
			//System.out.println("Enter the value at index position of the output array->" + i);
			for (int i = 0, j=array.length-1; i<=array.length-1; i++,j--)
			{
				array1[j]=array[i];
		
		}
		System.out.println("Enter the output array value" + Arrays.toString(array1));

	}

}
