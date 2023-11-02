import java.util.*;
class code4{
            public static void main(String[]args){
	              Scanner sc =new Scanner (System.in);
		      int x=sc.nextInt();
		      try{
		               System.out.println(10/x);
		      }catch(NullPointerException ie){
		              System.out.println("Exception Handled ");
		      }
	    }
}
