package byNotes2;

public class Diamond {

	public static void main(String[] args) {
		for(int i=10;i>=0;i--) {
			for(int j=0;j<=10;j++) {
				if(i<=j) {
					System.out.print("   *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.print(" * *   *   *   *   *   S   *   *   *   *   * *");
		System.out.println();
		for(int i=0;i<=10;i++) {
			
			for(int j=0;j<=10;j++) {
				
				if(i<=j) {
					System.out.print("   *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
