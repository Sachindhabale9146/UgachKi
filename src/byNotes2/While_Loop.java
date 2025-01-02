package byNotes2;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		while((n=sc.nextInt())!=0) {
			System.out.println("You Are Enter :- "+n);
		}
	}
}
