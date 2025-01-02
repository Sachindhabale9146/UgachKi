package byNotes2;

import java.util.Scanner;

public class While_Loop_Break_Keyword {

	public static void main(String[] args) {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			
			int n=sc.nextInt();
			if(n==0) {
				System.out.println("beake the loop");
				break;				
			}
			System.out.println("while loop");
			break;
		}
	}
}
