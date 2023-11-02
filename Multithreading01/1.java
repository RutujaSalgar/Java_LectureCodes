import java.io.*;
import java.util.*;
class demo{
          void m1()throws ArithmeticException
	  {
	    System.out.println("in m1");
	 int x=10/0;
	  }
	  void m2(){
	        System.out.println("In m2");
	  }
             public static void main(String[]args) throws ArithmeticException{
	      System.out.println("In main");
	      demo obj=new demo();
	 
	 
	     
	     obj. m1();
	      System.out.println("main");
	     }

}
