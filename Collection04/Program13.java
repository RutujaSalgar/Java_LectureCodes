import java.util.*;
class Program13{
             public static void main(String[]args){
	     ArrayList al=new ArrayList();
	     
	     al.add("Ashish");
	     al.add("Kanha");
	     al.add("Rahul");
	     al.add("Badhe");
	     
	     //for each
	     for(Object x:al){
	        System.out.println(x.getClass().getName());
	     }
	     
	     //iterator
	     Iterator itr=al.iterator();
	     while(itr.hasNext()){
	            if("Kanha".equals(itr.next()))
	                itr.remove();
	     }
	     System.out.println(al);
	     }
}
