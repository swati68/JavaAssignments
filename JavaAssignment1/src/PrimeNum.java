//Q.Write a program to check weather the no entered by user is prime or not.
import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		boolean flag = true;
		//if the number is not divisible by numbers till n/2, then it is prime
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("The number "+n+" is Prime");
		}
		else {
			System.out.println("The number "+n+" is not Prime");
		}
	}
}
//Output Snippet:
//Enter the number:
//5
//The number 5 is Prime