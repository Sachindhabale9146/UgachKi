package byNotes3;

import java.util.Scanner;

public class Check_Number_Is_Amstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		int b=a,c=0;
		
		while(b>0) {
			c =c+((b%10)*(b%10)*(b%10));
			System.out.println("c = "+c);
			b=b/10;
			System.out.println("b = "+b);
		}
		if(a==c) {
			System.out.println("Number is amstrong Number : "+a);
		}
		else {
			System.out.println("Number is Not amstrong number : "+a);
		}
	}
}
