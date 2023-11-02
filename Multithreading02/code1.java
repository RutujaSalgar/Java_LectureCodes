import java.io.*;
import java.util.*;
class myThread extends Thread{
              public void run(){
	               System.out.println("In run");
		       System.out.println(Thread.currentThread().getName());
	      }
}
class code1{
           public static void main(String[]args){
	        myThread obj=new myThread();
		System.out.println(Thread.currentThread().getName());
		obj.start();

	   }
}
