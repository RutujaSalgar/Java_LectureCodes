import java.util.*;
class code5{
            public static void main(String[]args){
	              Scanner sc =new Scanner (System.in);
		      int x=sc.nextInt();
		      try{
		               System.out.println(10/x);
		      }catch(ArithmeticException ie){
		              System.out.println("Exception Handled ");
		      }
	    }
}
