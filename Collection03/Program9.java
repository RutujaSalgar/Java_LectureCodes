import java.util.*;
class Program9{
              public static void  main(String[]args){
	         ArrayList al=new ArrayList();
	         al.add("Kanha");
	         al.add("Rahul");
	         al.add("Ashish");
	     Iterator itr=al.iterator();
	     while(itr.hasNext()){
	               System.out.println(itr.next());
	               
	     if("Rahul".equals(itr.next()))
	               itr.remove();
	             System.out.println(itr.next());
	     }
	    System.out.println(al);
	      
	      }
}
