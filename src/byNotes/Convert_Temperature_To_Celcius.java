package byNotes;

import java.util.Scanner;

public class Convert_Temperature_To_Celcius {

	public static void main(String[] args) {
		
		float Temperature,Celcius;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plase enter Temperature :- ");
		Temperature = sc.nextFloat();
		
		Celcius = ((Temperature - 32)*5)/9;
		
		System.out.println("Temperature in celcius :- "+Celcius);
	}
}
