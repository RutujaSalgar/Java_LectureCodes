import java.util.*;
class Program15{
               public static void main(String[]args){
	       ArrayList al=new ArrayList();
	     /*  al.add("Ashish");
	       al.add("Kanha");
	       al.add("Rahul");
	       al.add("Badhe");
*/
	       ListIterator itr=al.listIterator();
	       while(itr.hasNext()){
	               System.out.println(itr.next());
	       }
	       }}
