package objects;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class get_server_address {
	
	public static void main(String[] args) {

		  InetAddress ip;
		  try {

			ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip.getHostAddress());

		  } catch (UnknownHostException e) {

			e.printStackTrace();

		  }

		}
}


