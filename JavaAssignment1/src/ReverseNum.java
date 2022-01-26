//Q.Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int temp = n;   //creating temporary copy of the input
		int rev=0;
		while(n>0) {
			int rem = n%10;  //getting remainder or last digit
			rev = (rev*10)+rem;   //adding each digit from end to the reverse number
			n = n/10;   //eliminating last digit from number
		}
		System.out.println("The reverse of number "+temp+" is: "+rev);
	}
}
//Output Snippet:
//Enter the number:
//4851
//The reverse of number 4851 is: 1584