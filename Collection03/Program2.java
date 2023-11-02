import java.util.*;
class Prpgram2{
               public static void main(String[]args){
	       ArrayList al=new ArrayList();
	       al.add(10);
	       al.add(20);
	       al.add(30);
	       al.add(new Integer(40));
	       al.add(30);
	       for(Integer obj:al){
	            System.out.println(obj);
	       }
	       //for each loop madhe kontahi collection chi return value Object aste.
	       //therefore it is not compatible with other data type
	       //we can also use Var as a return type .it accept the data whatever come
	       //means it is runtime changing its return type 
	       
	       }}
