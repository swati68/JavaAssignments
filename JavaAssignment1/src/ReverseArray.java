//Q.Reverse an Array.
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n = sc.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		//swapping the array elements from left and right end and moving inwards 
		for(int i=0;i<n/2;i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		System.out.println("Array after reverse:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
//Output Snippet:
//Enter the length of array:
//5
//Enter the array elements:
//1 2 3 4 5
//Array after reverse:
//5 4 3 2 1 