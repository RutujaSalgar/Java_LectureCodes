import java.util.*;
import java.io.*;
class myThread extends Thread{
                public void run(){
		     System.out.println(Thread.currentThread());
		}
}
class code1{
            public static void main(String[]args){
		    System.out.println(Thread.currentThread());
	              myThread obj=new myThread();
		      obj.start();
	    }
}
