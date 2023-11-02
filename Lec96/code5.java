import java.io.*;
import java.net.*;
class code5{
          public static void main(String[]args)throws IOException{
	             URL  obj=new URL ("https://www.youtube.com");
		     URLConnection conn =obj.openConnection();
		     System.out.println("Last modified" +  new Date(conn.getLastModified()));
	  }
}

//beacuse URLConnection class not make object so, symbol cannot form
