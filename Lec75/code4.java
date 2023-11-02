import java.io.*;
import java.util.*;
class code4{
        public static void main(String[]args) throws IOException{
	           BufferedReader br=new BufferedReader(new InputStreamReader (System.in));

		   String str = br.readLine();

		   System.out.println(str);
		   int data=0;
		   try{
		          data=Integer.parseInt(br.readLine());
		   }catch (NumberFormatException  ob){
		        System.out.println("Please enter integer data");

			data =Integer.parseInt(br.readLine());
		   }
		   System.out.println(data);
	}
}
