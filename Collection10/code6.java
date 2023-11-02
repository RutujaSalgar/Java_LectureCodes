import java.util.concurrent.*;
class code6{
             public static void main(String[]args){
	     BlockingQueue bqueue=new ArrayBlockingQueue(3);
	     bqueue.offer(10);
	     bqueue.offer(20);
	     bqueue.offer(30);
	     System.out.println(bqueue);
	     }}
