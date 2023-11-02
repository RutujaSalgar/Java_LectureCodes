import java.io.*;
import java.util.*;
class myThread extends Thread{
	static Thread nmMain=null;
             public void run(){
                try{
		        nmMain.join(1000);
        	}catch(InterruptedException ie){
	
        	}
		for(int i=0;i<10;i++){
	       		 System.out.println("In Thread");
   		
	       	}
		try{
		         Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		
		}
	    }
}
class code11{
             public static void main(String[]args)throws InterruptedException{
	             myThread.nmMain=Thread.currentThread();
		     myThread obj=new myThread();

		     obj.start();
		     obj.join(1000);
		     for(int i=0;i<10;i++){
		              System.out.println("In main");
		     }
	     }
}
