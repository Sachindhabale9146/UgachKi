package byNotes3;

public class Print_All_Alphabet {

	public static void main(String[] args) {
		
	char ch;
	int a=1;
	for(ch='a';ch<='z';ch++) {
		System.out.print(" "+ch+a++);
		
	}
	System.out.print(":	" + a);
	}
}
