import java.net.*;
import java.io.*;
import java.util.*;
class Server{
	



	public static void main(String []args){
		Scanner keyboard=new Scanner(System.in);
		try (ServerSocket serversocket=new ServerSocket(5000)) {
			Socket client=serversocket.accept();
 			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
    		BufferedReader in = new BufferedReader(
    			  new InputStreamReader(client.getInputStream()));
    		for (int i=0;i<10;i++){
    		out.print("Hello World !!" +Integer.toString(i)+"\n\r" );
    		if(i==5)out.flush();
    		}
		
			client.close();

		}catch(Exception e){
			e.printStackTrace();

		}
	}

}