import java.io.*;
class code10{
      void m1(){
      
      }
      void m2(){
      
      }
      public static void main(String[]args){
           code10 obj1=new code10();
	   obj1.m1();
	   obj1=null;
	   try{
	        obj1.m2();
	   }catch(ArithmeticException obj5){
	         System.out.println("Here");
	   }finally{
	          System.out.println("Connection closed");
	   }
	   System.out.println("End Main");
      }
}
