import java.util.*;
class Program10{
            public static void main(String[]args){
	    ArrayList al=new ArrayList();
	    al.add(10);
	    al.add(20.5);
	    al.add(30.5f);
	    al.add("Shashi");
	    
	    for (Object x:al){
	             System.out.println(x.getClass().getName());
	    }
	    
	    Iterator cursor=al.iterator();
	    
	     
	        System.out.println(cursor.next());
	  	System.out.println(cursor.next());
		System.out.println(cursor.next());
		System.out.println(cursor.next());
		try{
		System.out.println(cursor.next());
		}catch(NoSuchElementException iiii){
		   System.out.println("Exception 2 is handled");
		}
	    
	    }
}
