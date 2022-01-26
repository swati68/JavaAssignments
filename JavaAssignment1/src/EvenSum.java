//Q.Given a number N, print sum of all even numbers from 1 to N.
import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number N:");
		int n = sc.nextInt();
		int sum =0;
		for(int i=2;i<=n;i+=2) {
			sum+=i;
		}
		System.out.println("The sum is: "+sum);
	}

}
//Output Snippet:
//Enter the number N:
//10
//The sum is: 30