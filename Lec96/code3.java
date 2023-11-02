import java.net.*;
import java.io.*;
class code3{
             public static void main(String[]args) throws IOException{
	           URL obj=new URL("https://www.Core2web.in:80");

		   System.out.println(obj.getProtocol());
		   System.out.println(obj.getPort());
		   System.out.println(obj.getFile());
	     }
}
