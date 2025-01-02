package byNotes;

import java.util.Scanner;

public class Add_Two_Number {

	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a=");
		a=sc.nextInt();
		System.out.println("enter b=");
		b=sc.nextInt();
		
		int c = a+b;
		System.out.println("Addition of two value : "+c);
	}
}
