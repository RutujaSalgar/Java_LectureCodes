//IOException
import java.io.*;
class Program1{
                 public static void main(String[]args){
		            System.out.println("In main");
		        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		        String str=br.readLine();
		          System.out.println(str);
		   System.out.println("End MAin");
		 
		 }
}
//readLine() method throws IOException hence,error:unreported exception IOException must be caught or declared
// to be thrown
