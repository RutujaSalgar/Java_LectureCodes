import java.util.concurrent.*;
import java .util.*;
class producer implements Runnable{
         BlockingQueue   bqueue= null;
         producer(BlockingQueue bqueue){
	      this.bqueue=bqueue;
	 }
	 public void run(){
	      for(int i=1;i<=10;i++){
	           try{
		       bqueue.put(i);
		      System.out.println("Produce" + i); 
		   }catch(InterruptedException ie){
		         
		   }
		   try{
		       Thread.sleep(3000);   
		   }catch(InterruptedException ie){
		   
		   }
	      }
	 }
}
class consumer implements Runnable{
         BlockingQueue bqueue =null;
         consumer(BlockingQueue bqueue){
	        this.bqueue=bqueue; 
	 }
	 public void run(){
	        for(int i=1;i<=10;i++){
		   try{
		        bqueue.take();
			System.out.println("consume"+ i);
		   }catch(InterruptedException ie){
		     
		   }
		   try{
		       Thread.sleep(3000);
		   }catch(InterruptedException ie){
		   
		   }
		}
	 }
}
class code15{
    public static void main(String[]args){
        BlockingQueue bqueue=new ArrayBlockingQueue(3);
	producer produce =new producer(bqueue);
	consumer consume=new consumer(bqueue);

	Thread producerThread=new Thread(produce);
	Thread consumerThread=new Thread(consume);

	producerThread.start();
	consumerThread.start();
      
 }}
