package byNotes3;

import java.util.Scanner;

public class Prime_Number_In_Range {

	public static void main(String[] args) {
		int Prime=0,total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number :- ");
		int a = sc.nextInt();
		
		for(int b=2;b<=a;b++) {
			for(int c=b;c>=2;c--) {
				if(b%c==0) {
					Prime++;
				}
			}
			if(Prime==1) {
				System.out.println("Given Number Is Prime Number : "+b);
				total++;				
			}
			Prime=0;
		}
		System.out.println("Total Count Of Prime Number In The Range : "+total);
						
	}
}
