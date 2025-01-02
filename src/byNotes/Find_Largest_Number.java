package byNotes;

import java.util.Scanner;

public class Find_Largest_Number {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a,b,c value:");
		a= sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("a is largest value :-"+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is largest value :-"+b);
		}
		else if(c>a && c>b) {
			System.out.println("c is largest value :-"+c);
		}
		else {
			System.out.println("all number are equal");
		}
	}
}
