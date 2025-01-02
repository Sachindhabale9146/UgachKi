package byNotes;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please Enter Username : ");
		String Name = sc.next();
		//System.out.println();
		System.out.print("Please Enter Password : ");
		String Password = sc.next();
		
		System.out.println("****Welcome****");
		
	}
}
