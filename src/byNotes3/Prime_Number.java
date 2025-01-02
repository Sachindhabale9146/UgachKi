package byNotes3;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int c=0;
		int count= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:- ");
		int a = sc.nextInt();
		for (int b=2;b<=a;b++) {
			if(a%b==0) {
				c++;
			}
		}
		if(a==2) {
			System.out.println("Given Number Is Prime Number : "+a);
			count += 1;
		}
		else if(c==1) {
			System.out.println("Given Number Is Prime Number : "+a);
			count +=1;
		}
		else {
			System.out.println("Given Number is Not Prime NUmber!!!");
		}
		try {
			
		}
		finally {
			System.out.println("Thank You !!");
			System.out.println(count);
		}
	}
}
