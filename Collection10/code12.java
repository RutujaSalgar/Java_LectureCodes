import java.util.*;
import java.util.concurrent.*;
class code12{
             public static void main(String[]args)  throws InterruptedException{
             
		     BlockingQueue bqueue=new PriorityBlockingQueue(3);
	     
	     bqueue.put(10);
	     bqueue.put(20);
	     bqueue.put(30);
	     
	     System.out.println(bqueue);

	     bqueue.offer(40,5,TimeUnit.SECONDS);
	     System.out.println(bqueue);

        
	     }}
