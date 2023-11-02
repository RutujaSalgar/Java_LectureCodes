import java.io.*;
import java.lang.*;
import java.util.*;
class myThread implements Runnable{
        public void run(){
	        System.out.println(Thread.currentThread());
		try{
		       Thread.sleep(5000);
		}catch(InterruptedException ie){
		        System.out.println(ie.toString());
		}
	}
}
class code8{
               public static void main(String[]args)throws InterruptedException{
	              ThreadGroup pThreadGP=new ThreadGroup("India");

		      myThread obj1 =new myThread(pThreadGP ,"MAHA");
		      myThread obj2 =new myThread(pThreadGP , "GOA");

		      Thread t1 = new Thread(pThreadGP , obj1);
		      Thread t2 = new Thread(pThreadGP , obj2);

		      t1.start();
		      t2.start();
	       }

}
