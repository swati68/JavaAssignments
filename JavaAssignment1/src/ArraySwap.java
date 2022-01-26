//Q.Swap the numbers in Array.

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n = sc.nextInt();
		System.out.println("Enter array elements:");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//swapping two elements at a time in the array
		for(int j=0;j<n-1;j+=2) {
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
		}
		System.out.println("The array elements after swap:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
//Output Snippet:
//Enter the length of array:
//5
//Enter array elements:
//1 2 3 4 5
//The array elements after swap:
//2 1 4 3 5 
