import java.net.*;
import java.io.*;
class Client{
	



public static void main(String []args){
	try{
		DatagramSocket socket=new DatagramSocket(6000);
			byte buf[]=new byte[1000];
		DatagramPacket p= new DatagramPacket(buf, buf.length);
		socket.receive(p);
		 System.out.println(new String(p.getData(),0,
		 	p.getLength()));
	}
	catch(Exception e){
		e.printStackTrace();
	}
   }
}