import java.util.*;
import java.util.concurrent.*;
class code4{
          public static void main(String[]args) throws InterruptedException{
	  BlockingQueue  bqueue=new ArrayBlockingQueue(3);
          bqueue.offer(10);
	  bqueue.offer(20);
	  bqueue.offer(30);
	  System.out.println(bqueue);
          bqueue.put(40);
	  System.out.println(bqueue);

	 
	  
	  }}
