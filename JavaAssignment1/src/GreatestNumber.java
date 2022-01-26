//Q.Write a program to find the greatest between the 3 nos and display the output. (Take input from user)
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 2:");
		int b = sc.nextInt();
		System.out.println("Enter number 3:");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Greatest number is:"+a);
		}
		else if(b>a && b>c){
			System.out.println("Greatest number is:"+b);
		}
		else {
			System.out.println("Greatest number is:"+c);
		}
	}

}
//Output Snippet:
//Enter number 1:
//49
//Enter number 2:
//1
//Enter number 3:
//8
//Greatest number is:49