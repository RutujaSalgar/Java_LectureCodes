import java.io.*;
import java.util.*;
class myThread extends Thread{
              public void run(){
	               System.out.println(Thread.currentThread());
	      }
}
class code2{
          public static void main(String[]args){
		  System.out.println(Thread.currentThread());
	            myThread obj=new myThread();
		    obj.start();

		    Thread.currentThread().setName("Core2web");
                   System.out.println(Thread.currentThread());

	  }
}
