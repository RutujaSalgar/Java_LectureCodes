import java.io.*;
class code5{
          public static void main(String[]args)throws IOException{
	       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
               
	       System.out.println("Enter Array Size");
	       int count =0;
	       int size = Integer.parseInt(br.readLine());
	       int arr [] = new int[size];

	       System.out.println("Enter Element");
	      
	       for(int i=0;i<arr.length;i++){
		   arr[i] =Integer.parseInt(br.readLine());
	       }

	       for(int i=0;i<arr.length;i++){
	           if(arr[i]%2==0){
		         count++;
		   }
	       }
	       System.out.println("Even Count = " + count);
	  
	  
}
}
