package byNotes3;

public class Compare_String {
	public static void main(String[] args) {
		
		String A="String1";
		String B = "String2";
		System.out.println("the comparision : "+A.compareTo(B));
		System.out.println("the comparision : "+A.compareToIgnoreCase(B));
		
		System.out.println("Start with methods : "+A.startsWith("S"));
		System.out.println("End With Methods : "+B.endsWith("2"));
		System.out.println("Ends with Methods : "+ B.endsWith("A"));
		
		String str = "this is the Sachin laptop";
		
		int indx=str.indexOf("the");
		
		System.out.println("index of : "+indx);
		
		String Str2 = str.replaceAll("the", "A");
		
		System.out.println("after replace : "+ Str2);
		
	}
}
