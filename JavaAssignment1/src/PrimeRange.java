//Q.Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
import java.util.Scanner;

public class PrimeRange {
	//static function to check if the number is prime
	public static boolean prime(int n){
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		for(int i=2;i<=n;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}
	}
}
//Output Snippet:
//Enter the number:
//11
//2 3 5 7 11 