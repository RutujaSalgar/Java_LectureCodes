import java.util.*;
import java.util.concurrent.*;
class code8{
             public static void main(String[]args)  throws InterruptedException{
             
		     BlockingQueue bqueue=new ArrayBlockingQueue(3);
	     
	     bqueue.offer(10);
	     bqueue.offer(20);
	     bqueue.offer(30);
	     
	     System.out.println(bqueue);

	     bqueue.offer(40,5,TimeUnit.SECONDS);
	     System.out.println(bqueue);

             ArrayList al=new ArrayList();
	     System.out.println("ArrayList"+ al);

	     bqueue.drainTo(al);
	     System.out.println("ArrayList"+ al);
	     System.out.println(bqueue);

	     }}
