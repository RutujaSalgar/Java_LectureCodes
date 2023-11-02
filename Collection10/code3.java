import java.util.*;
import java.util.concurrent.*;
class code3{
          public static void main(String[]args){
	  BlockingQueue  bqueue=new ArrayBlockingQueue(3);
          bqueue.offer(10);
	  bqueue.offer(20);
	  bqueue.offer(30);
          bqueue.put(40);
	  System.out.println(bqueue);

	 
	  
	  }}
