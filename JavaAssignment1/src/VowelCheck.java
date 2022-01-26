//Q.Write a program to find weather the character entered by user is a vowel or not.(solve by using if..else and switch case)
import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:");
		char c = sc.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("The character "+c+" is a vowel");
			break;
		default:
			System.out.println("the character "+c+" is not a vowel.");
		}
	}

}
//Output Snippet:
//Enter a character:
//s
//the character s is not a vowel.