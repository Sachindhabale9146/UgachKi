package byNotes2;

import java.util.Scanner;

public class Greater_String {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please Enter First String...");
		String S1=sc.nextLine();
		
		System.out.println("please Enter Second String...");
		String S2= sc.nextLine();
		
		
		int a= S1.compareTo(S2);		
		int b= S2.compareTo(S1);
		System.out.println("a="+a+" b="+b);
		if(a>b) {
			System.out.println("First String Is Greater Than Second String...");
		}
		else if(b>a) {
			System.out.println("Second String Is Greater Than First String...");
		}
		else {
			System.out.println("Both String Are Equal...");
		}
	}

}
