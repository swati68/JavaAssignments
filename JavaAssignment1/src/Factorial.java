//Q.Write a program to calculate and display the factorial of a no entered by user.
import java.util.Scanner;

public class Factorial {
	//recursive function to calculate factorial
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int n = sc.nextInt();
		int result = fact(n);
		System.out.println("The factorial of "+n+" is: "+result);
	}

}
//Output Snippet:
//Enter the number to find factorial:
//4
//The factorial of 4 is: 24