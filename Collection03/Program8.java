import java.util.*;
class Program8{
            public static void main(String[]args){
	    ArrayList al=new ArrayList();
	    al.add("Kanha");
	    al.add("Rahul");
	    al.add("Ashish");

	    Iterator itr= al.iterator();
	    while(itr.hasNext()){
		    System.out.println(itr.next());
	            if("Ashish".equals(itr.next()))
	                   itr.remove();
	    }
	    System.out.println(al);
	    
	    }}
