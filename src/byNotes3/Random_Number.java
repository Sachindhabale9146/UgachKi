package byNotes3;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			System.out.println("Random Number : "+r.nextInt(100));
		}
	}
}
