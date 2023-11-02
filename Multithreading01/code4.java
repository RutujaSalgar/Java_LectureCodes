//Thread by Thread class
import java.util.*;
import java.io.*;
class myThread extends Thread{
         public void run (){
	        for(int i=0; i<10;i++){
		       System.out.println("In run");
		}
	 }
}
class code4{
       public static void main(String[]args){
            myThread obj=new myThread();
	    obj.start();

	    for(int i=0;i<10;i++){
	       System.out.println("In main");
	    }
       }
}
