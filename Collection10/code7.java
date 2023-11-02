import java.util.concurrent.*;
class code7{
             public static void main(String[]args)  throws InterruptedException{
             
		     BlockingQueue bqueue=new ArrayBlockingQueue(3);
	     
	     bqueue.offer(10);
	     bqueue.offer(20);
	     bqueue.offer(30);
	     
	     System.out.println(bqueue);

	     bqueue.offer(40,5,TimeUnit.SECONDS);
	     System.out.println(bqueue);

	     bqueue.take();
	     System.out.println(bqueue);
	     }}
