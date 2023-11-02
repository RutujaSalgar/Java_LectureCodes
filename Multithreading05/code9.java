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
class code9{
               public static void main(String[]args)throws InterruptedException{
	              ThreadGroup pThreadGP=new ThreadGroup("India");

		      
		      myThread obj1 =new myThread();
		      myThread obj2 =new myThread();

		      Thread t1 = new Thread(pThreadGP , obj1,"Maha");
		      Thread t2 = new Thread(pThreadGP , obj2 ,"Goa");

		      t1.start();
		      t2.start();

		      ThreadGroup cThreadGP =new ThreadGroup(pThreadGP ,"Pakistan");

		      myThread obj3  =new myThread();
		      myThread obj4 =new myThread();

		      Thread t3= new Thread(cThreadGP ,obj3,"Karachi");
		      Thread t4= new Thread(cThreadGP ,obj4 ,"Lahore");

		      t3.start();
		      t4.start();
	       }

}
