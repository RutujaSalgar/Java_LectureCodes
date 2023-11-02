import java.util.*;
class code3{
         static void fun(int x){
	     System.out.println(x);
	     fun(++x);
	 }
	 public static void main(String[]args){
	       fun(1);
	 }
}
