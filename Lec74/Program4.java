import java.io.*;
class Program4{
          void getData(){
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       int data = Integer.parseInt(br.readLine());
	  
	       System.out.println(data);
	     
	  
	  }
         public static void main(String[]args){
	    Program4 obj =new Program4();
	     obj.getData();
	 }
}
