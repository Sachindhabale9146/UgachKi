package byNotes2;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		
		int n, Reverse=0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Given Number :- "+n);
		while(n>0) {
			
			Reverse = Reverse *10;
			Reverse = Reverse + n%10;
			n=n/10;
			
		}
		System.out.println("After Reverse String :- " +Reverse);
	}
}
