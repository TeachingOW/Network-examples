import java.net.*;
import java.io.*;
class Client{
	



public static void main(String []args){
	try{
		Socket server=new Socket("127.0.0.1", 5000);
		PrintWriter out = new PrintWriter(server.getOutputStream(), true);
    	BufferedReader in = new BufferedReader(
    			  new InputStreamReader(server.getInputStream()));

for(int i=0;i<100;i++){
    	String line=in.readLine();
    	if(line!=null)
    	System.out.println(line.toUpperCase());

}
		server.close();
	}
	catch(Exception e){
		e.printStackTrace();
	}
   }
}