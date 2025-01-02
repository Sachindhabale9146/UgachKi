package byNotes2;

import java.util.Scanner;

public class If_Else {
	public static void main(String[] args) {
		
		int mark;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter obtained marked : ");
		mark = sc.nextInt();
		
		if (mark>=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		sc.close();
	}
}
