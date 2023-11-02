import java.util.*;
import java.io.*;
interface Demo{
       static void fun(){
          System.out.println("In static fun");
       }
       default void gun(){
          System.out.println("In default gun");
       }
}
class Demochild implements Demo{


}
class code1{
         public static void main(String[]args){
	  Demochild obj =new Demochild();
	  obj.fun();
	  obj.gun();
	 }
}
