import java.io.*;
class Program4_solution{
              void getData() throws IOException{
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int data= Integer.parseInt(br.readLine());
	      
	      System.out.println(data);
	      }
         public static void main(String[]args)throws IOException{

	 
	        Program4_solution obj = new Program4_solution();
	     obj.getData();
	 }
}
