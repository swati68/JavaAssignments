//Q. Write a program to print the following patterns
import java.util.Scanner;

public class Patterns {
	//function to print pattern:
	//for n=4
	//1
	//22
	//333
	//4444
	public void p1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	/*function to print pattern:
	 * for n=4
		4444
		4444
		4444
		4444
	 */
	public void p2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	/*function to print pattern:
	  for n=5
		    * 
		   * * 
		  * * * 
		 * * * * 
		* * * * *
	 */
	public void p3(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//user asked to choose the pattern he wants to print
		System.out.println("Enter the pattern number to choose:");
		int patt = sc.nextInt();
		System.out.println("Enter the number n:");
		int n = sc.nextInt();
		Patterns obj = new Patterns();
		switch(patt) {
		case 1:
			obj.p1(n);
			break;
		case 2:
			obj.p2(n);
			break;
		case 3:
			obj.p3(n);
			break;
		default:
			System.out.println("Incorrent pattern number!!");
		}
		
	}

}
