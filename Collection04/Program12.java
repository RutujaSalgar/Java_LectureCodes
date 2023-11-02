import java.util.*;
class Program12{
              public static void main(String[]args){
	      ArrayList al=new ArrayList();

	      al.add(10);
	      al.add(20.5);
	      al.add(30.5f);
	      al.add("Shashi");

	      Iterator itr =al.iterator();
	      while(itr.hasNext()){
	             System.out.println(itr.next());
	             itr.remove();
	      }
	      System.out.println(al);
	      }}
