//Q.Write a program to find weather the no entered by user is even or odd.
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.print("The number "+num+" is Even");
		}
		else {
			System.out.print("The number "+num+" is Odd");
		}
		sc.close();
	}

}
//Output Snippet:
//Enter the number:
//48
//The number 48 is Even