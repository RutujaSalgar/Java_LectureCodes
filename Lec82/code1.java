import java.util.concurrent.*;
class myThread implements Runnable{
    int num=0;

    myThread(int num){
       this.num=num;
    }
    public void run(){
           System.out.println("Start : "+ num+Thread.currentThread());
    
    dailyTask();
    System.out.println("End : "+num+Thread.currentThread());
    }
    void dailyTask(){
          try{
	         Thread.sleep(10000);
	  }catch ( InterruptedException ie){
	       
	  }
    }
}
class code1{
       public static void main(String[]args){
             ThreadPoolExecutor tpe=(ThreadPoolExecutor) Executors.newFixedThreadPool(5);

	     for(int i=1;i<=10;i++){
	              myThread obj =new myThread(i);
		      tpe.execute(obj);
	     }
	     tpe.shutdown();
	     }
       }

