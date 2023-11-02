import java.io.*;
import java.util.*;
class myThread extends Thread{
            public void run () {
	               for(int i=0;i<10;i++){
		        System.out.println("In run ");
			Thread.sleep(100iii
		       }
	    }
}
class code6{
         public static void main(String[]args) throws InterruptedException{
	         myThread obj=new myThread();
		 obj.start();

		 for(int i=0;i<19;i++){
		       System.out.println("In main");

		       Thread.sleep(1000);
		 }
	 }
}
