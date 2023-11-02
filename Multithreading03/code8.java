import java.io.*;
import java.util.*;
class myThread extends Thread{
	
             public void run(){
	             for(int i=0;i<10;i++){
		          System.out.println("In thread-0");
		     }
	     }
}
class code8{
         public static void main(String[]args)throws InterruptedException {
	         myThread obj =new myThread();
		 obj.start();
		 obj.join();
		 for(int i=0;i<10;i++){
		            System.out.println("In main");
		 }
	 }
}
