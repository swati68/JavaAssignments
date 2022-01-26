//Q.Write a program to swap the values of 2 nos.(Take input from user)
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The numbers after Swap: a= "+a+", b= "+b);
	}

}
//Output Snippet:
//Enter the two numbers:
//10 20
//The numbers after Swap: a= 20, b= 10