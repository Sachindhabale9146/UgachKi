package byNotes4;

import java.lang.ProcessHandle.Info;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_IP_Address {

	public static void main(String[] args) throws UnknownHostException {
		
		System.out.println("local host : "+InetAddress.getLocalHost());
	}
}
