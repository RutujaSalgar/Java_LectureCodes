import java.io.*;
import java.util.*;
class myThread extends Thread{
	static Thread nmMain=null;
             public void run(){
                try{
		        nmMain.join();
        	}catch(InterruptedException ie){
	
        	}
		for(int i=0;i<10;i++){
	       		 System.out.println("In Thread");
   		
	       	}
		try{
		         Thread.sleep();
		}catch(InterruptedException ie){
		
		
		}
	    }
}
class code10{
             public static void main(String[]args)throws InterruptedException{
	             myThread.nmMain=Thread.currentThread();
		     myThread obj=new myThread();

		     obj.start();
		     obj.join();
		     for(int i=0;i<10;i++){
		              System.out.println("In main");
		     }
	     }
}
