package byNotes;

import java.util.Scanner;

public class Swap_2_Number_Without_3_Variable {

	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of a=");
		a=sc.nextInt();
		System.out.println("enter value of b=");
		b=sc.nextInt();
		System.out.println("a="+a +" "+"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a +" "+"b="+b);
				
	}
}
