//ListIterator
import java.util.*;
class Program14{
            public static void main(String[]args){
	    ArrayList al=new ArrayList();
	    al.add("Ashish");
	    al.add("Kanha");
	    al.add("Rahul");
	    al.add("Badhe");

	    ListIterator itr =al.listIterator();
            

	    //for each
	    for(Object x:al){
	       System.out.println (x.getClass().getName());
	    }
	    System.out.println(itr.getClass().getName());

	    }}
