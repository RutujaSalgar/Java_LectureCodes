
import java.lang.*;
class myThread extends Thread{
         public void run(){
	     System.out.println(Thread.currentThread());
	 }
         myThread(ThreadGroup gp , String str){
	  super (gp ,str);
	 }
}
class code3{
          public static void main(String[]args){
	       
	  ThreadGroup pThreadGP=new ThreadGroup("INDIA");
	  
	  myThread t1=new myThread(pThreadGP ,"MAHARASTRA");
	  myThread t2=new myThread(pThreadGP , "GOA");
	  
	  t1.start();
	  t2.start();
	  
	  ThreadGroup cThreadGP=new ThreadGroup(pThreadGP , "PAKISTAN");
	 
	  myThread t3=new myThread(cThreadGP,"KARACHI");
	  myThread t4=new myThread(cThreadGP, "LAHORE");

	  t3.start();
	  t4.start();

	  System.out.println(pThreadGP.activeCount());
          System.out.println(pThreadGP.activeGroupCount());
           
	  }
}
