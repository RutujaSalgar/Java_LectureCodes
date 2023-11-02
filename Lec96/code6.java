import java.io.*;
import java.net.*;
class code6{
             public static void main(String[]args)throws IOException{
	        ServerSocket ss=new ServerSocket(1200);
		Socket s=ss.accept();

		System.out.println("Connection established ");

		OutputStream os=s.getOutputStream();
		PrintStream  ps=new PrintStream(os);

		ps.close();
		s.close();
		ss.close();
	     }
}
