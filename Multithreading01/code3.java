import java.io.*;
import java.util.*;
class code3{
            static void fun() throws InterruptedException{
	          for(int i=10 ; i<20 ; i++){
		       System.out.println(i);
		  }
		  try{
		       Thread.sleep(2000);
		  }catch(InterruptedException ie){
		  
		  }
	    }
          public static void main(String[]args)throws InterruptedException{
	      for(int i=1;i<10;i++){
	                System.out.println(i);
			Thread.sleep(2000);

	      }
	      fun();
	  }
}
