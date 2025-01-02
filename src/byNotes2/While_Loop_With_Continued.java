package byNotes2;

public class While_Loop_With_Continued {

	public static void main(String[] args) {
		int n=0;
		while(n<10) {
			n++;
			if((n<4)) {
				System.out.println("Continue...");
				continue;
			}
			System.out.println("the number : " +n);
			
		}
	}
}
