//Q.Write a program to print odd nos from 50-100 using do while loop.
public class OddNum {

	public static void main(String[] args) {
		int i=50;
		do {
			if(i%2!=0)
				System.out.print(i+" ");
			i++;
		}while(i<=100);
	}

}
//Output Snippet:
//51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 