package byNotes4;

import java.io.IOException;

public class Open_Notepad {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		try{
//			r.exec("notepad");
			r.exec("google chrome");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
