import java.util.*;
class Program11{
   public static void main(String[]aregs){
         ArrayList al=new ArrayList();
          al.add(10);
          al.add(20.5);
          al.add(30.5f);
          al.add("Shahshi");
        

	  Iterator itr= al.iterator();
	  while(itr.hasNext()){
	           System.out.println(itr.next());
	  }
	  System.out.println(itr.next());


   }}
