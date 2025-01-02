package byNotes;

import java.util.Scanner;

public class Swap_Two_Number {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Value a=");
		a=sc.nextInt();
		
		System.out.println("Enter Value b=");
		b=sc.nextInt();
		
		System.out.println("a="+a +" "+ "b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a +" "+ "b="+b);
		System.out.println("Successfully Executed Program...");
		
	}

}
