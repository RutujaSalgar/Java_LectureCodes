import java.io.*;

import java.util.*;
class myThread extends Thread{
              public void run(){
	               System.out.println(Thread.currentThread());
		       try{
		              Thread.sleep(1000);
		       }catch (InterruptedException iew ){
		       
		       }catch(InterruptedException ie){
		       
		       }
	      }
}
class code6{
          public static void main(String[]args)throws InterruptedException{
		  System.out.println(Thread.currentThread());
	            myThread obj=new myThread();
		    obj.start();
		    Thread.sleep(2000);
		    Thread.currentThread().setName("Core2web");
                   System.out.println(Thread.currentThread());

	  }
}
