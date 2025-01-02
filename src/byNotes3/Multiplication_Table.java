package byNotes3;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		System.out.println("which Enter The Table Number...");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int b=1;b<=10;b++) {
			System.out.println(a+"*"+b+"  = "+a*b);
			
		}
	}
}
