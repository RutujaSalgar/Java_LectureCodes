import java.io.*;
class Program4_solution2{
              void getData(){
	           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   int data=0;
		   try{
	            data = Integer.parseInt(br.readLine());
		   }catch(IOException ie){
		   }
	           System.out.println(data);
	      }
              public static void main(String[]aths){
	              Program4_solution2 obj=new Program4_solution2();
	              obj.getData();
	      }
}
