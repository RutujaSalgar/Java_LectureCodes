//Iterator     (Interface)
import java.util.*;
class Program10{
               public static void main(String[]args){
		       ArrayList al=new ArrayList();
		       al.add("kanha");
		       al.add("Ashish");
		       al.add("Badhe");


		       Iterator itr=al.iterator();
		       while(itr.hasNext()){
		              System.out.println(itr.next());

			      if("Badhe".equals(itr.next())){
			            itr.remove();
			      }
		       }
		 //    System.out.println(al);
	       }}
