import java.net.*;
import java.io.*;
import java.util.*;
class Server{
	

	public static void main(String []args){
		Scanner keyboard=new Scanner(System.in);
		try (DatagramSocket socket=new DatagramSocket(5000)) {
			

		byte buf[]=new byte[1000];
		
		String str="Hello World!!!";	
		buf = str.getBytes();
		InetAddress address=InetAddress.getByName("127.0.0.1");
		DatagramPacket	packet = new DatagramPacket(buf, buf.length, address, 6000);
		socket.send(packet);

			
		}catch(Exception e){
			e.printStackTrace();

		}
	}

}