class myThread extends Thread{
     public void run(){
           System.out.println(Thread.currentThread());
     }
     myThread(ThreadGroup tg,String str){
             super(tg,str);
     }
}
class code1{
          public static void main(String[]args){
	    ThreadGroup pThreadGP=new ThreadGroup("India");
	  
	  myThread t1=new myThread(pThreadGP,"MAHARASTRA");
	  myThread t2=new myThread(pThreadGP , "GOA");
	  
	  t1.start();
	  t2.start();

	  }
}
