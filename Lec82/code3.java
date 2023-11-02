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
	         Thread.sleep(40000);
	  }catch ( InterruptedException ie){
	       
	  }
    }
}
class code3{
       public static void main(String[]args){
             ThreadPoolExecutor tpe1=(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
             ThreadPoolExecutor tpe2=(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
	     for(int i=1;i<=4;i++){
	              myThread obj =new myThread(i);
		      tpe1.execute(obj);
	     }
	     for(int i=1;i<=4;i++){
	              myThread obj2=new myThread(i);
		      tpe2.execute(obj2);
	     }
	     tpe1.shutdown();
	     tpe2.shutdown();
	     }
       }

