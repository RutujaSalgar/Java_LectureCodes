import java.util.*;
import java.util.concurrent.*;
class code13{
             public static void main(String[]args)  throws InterruptedException{
             
		     BlockingQueue bqueue=new PriorityBlockingQueue(3);
	     
	     bqueue.put("Kanha");
	     bqueue.put("Ashish");
	     bqueue.put("Rahul");
	     
	     System.out.println(bqueue);

	     bqueue.offer("Badhe",5,TimeUnit.SECONDS);
	     System.out.println(bqueue);

        
	     }}
