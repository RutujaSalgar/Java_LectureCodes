import java.util.concurrent.*;
class code5{
             public static void main(String[]args){
	     BlockingQueue bqueue=new ArrayBlockingQueue(3);
	     bqueue.offer(10);
	     bqueue.offer(20);
	     bqueue.offer(30);
	     System.out.println(bqueue);

	     try{
	             bqueue.put(40);
	     }catch(InterruptedException ie){
	             System.out.println("Block..........");
	     }
	     }}
