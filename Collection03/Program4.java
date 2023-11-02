import java.util.*;
class Program4{
           public static void main(String []args){
	   ArrayList al=new ArrayList();
	   al.add(10);
	   al.add(20);
	   al.add(30);
	   al.add(new Integer(40));
	   al.add(40);

	   for(Object obj:al){
	         System.out.println(obj);
	   }

	   for(int i=0;i<al.size();i++){
	            System.out.println(al.get(i));
	   }
	   
	   
	   
	   
	   
	   
	   
	   }}
