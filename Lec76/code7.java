import java.util.*;

class DataOverFlowException{
         DataOverFlowException(String str){
	 
	 }
}
class DataUnderFlowException{
         DataUnderFlowException(String str){
	 
	 }
}
class code7{
            public static void main(String[]args){

		    int arr[] =new int[5];
	            Scanner sc =new Scanner(System.in);

		    System.out.println("Enter integer value");
		    System.out.println("Note : 0 <element <100 ");

		    for(int i=0;i<arr.length;i++){
		            int data=sc.nextInt();
			    if(data<0)

				    throw new DataUnderFlowException("Data is smaller than 0");
			    if(data>100)

				    throw new DataOverFlowException("Data is greater than 100");

			    arr[i] =data;
		    }
		    for(int i=0;i<arr.length;i++){
		    
		             System.out.println(arr[i] + "  " );
		    }
		}
}

