import java.util.*;
class Program7{
              public static void main(String[]args){
	           LinkedList ll=new LinkedList();
		   ll.add(10);
		   ll.add(20);
		   ll.add(30);
		   ll.add(40);
		   ll.add(50);
                  
		  //getFirst
		  System.out.println(ll.getFirst());      //10

		  //getLast
		  System.out.println(ll.getLast());       //50
                  
		  //removeFirst
		  System.out.println(ll.removeFirst());   //10

		  //removeLast
		  System.out.println(ll.removeLast());     //50

		  //addFirst
		  ll.addFirst(10);
		  System.out.println(ll);                  //[10 ,20, 30 ,40]
							 
                  //addLast
		  ll.addLast(50);
		  System.out.println(ll);                  //[10,20,30,40,50]

		  //java.util.LinkedList$Node<E>node(int);




	      }}
