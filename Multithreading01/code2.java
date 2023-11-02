import java.util.*;
import java.io.*;
class code2{
         static void fun() throws InterruptedException{
	     for(int i=0 ; i<20 ;i++ )
	           System.out.println(i);
	     Thread.sleep(2000);
	 }
	     
	 public static void main(String[]args)throws InterruptedException{
	      for(int i=0;i<10;i++){
	          System.out.println(i);
		  Thread.sleep(2000);
	      }
	 fun();
	 }
}

