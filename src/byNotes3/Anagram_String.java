package byNotes3;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter string S1 : ");
		String S1 = sc.nextLine();
		System.out.println("pls enter string S2 : ");
		String S2 = sc.nextLine();
		
		S1.toLowerCase();
		S2.toLowerCase();
		
		System.out.print(S1+" "+S2);
		
		char[] s1 = S1.toCharArray();
		char[] s2 = S2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		boolean status = Arrays.equals(s1, s2);
		
		if(status) {
			System.out.println(" Both String Are Anagram...");
		}
		else {
			System.out.println(" Both String Are Not Anagram...");
		}
		
		
	}
}
