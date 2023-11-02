import java.util.concurrent.*;
class myThread implements Runnable{
     int num ;
     myThread(int num){
          this.num=num;
     }
     public void run(){
            System.out.println(Thread.currentThread() + "Start Thread " + num);

	    dailyTask();

	    System.out.println(Thread.currentThread() + "End Thread " +num);
     }
     void dailyTask(){
           try{
	        Thread.sleep(5000);
	   }catch(InterruptedException ie){
	   
	   }
     }
}
class code10{
         public static void main(String[]args){
	         ExecutorService ser =Executors.newFixedThreadPool(5);

		 for(int i=1;i<=10;i++){
		        myThread obj =new myThread(i);
			ser.execute(obj);
		 }
	 }
}
