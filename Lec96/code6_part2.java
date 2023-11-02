import java.io.*;
import java.net.*;
class code6_part2{
           public static void main(String[]args)throws IOException{
	           Socket s=new Socket("localhost" ,1200);
		   InputStream is=s.getInputStream();
		   BufferedReader br=new BufferedReader(new InputStreamReader(is));
		   String str;
		   while((str=br.readLine()) !=null){
		            System.out.println(str);
		   }
		   br.close();
		   s.close();
	   }
}
