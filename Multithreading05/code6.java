import java.lang.* ;
class myThread extends Thread{
	  myThread (ThreadGroup tg,String str){
	         super(tg,str);
	  }
         public void run(){
	      System.out.println(Thread.currentThread());
	  try{
	          Thread.sleep(5000);
	  }catch(InterruptedException ie){
	              System.out.println(ie.toString());
	  }
}
}
class code6{
         public static void main(String[]args) throws InterruptedException{
	  
	 ThreadGroup pThreadGP =new ThreadGroup("INDIA");
	 
	 myThread t1= new myThread(pThreadGP ,"MAHARASTRA");
	 myThread t2= new myThread(pThreadGP  ," GOA");

	 t1.start();
	 t2.start();

	 ThreadGroup cThreadGP = new ThreadGroup(pThreadGP , "PAKISTAN");

	 myThread t3 = new myThread(cThreadGP ,"KARACHI");
	 myThread t4 =new myThread(cThreadGP ,"LAHORE ") ;

	 t3.start();
	 t4.start();

	 ThreadGroup cThreadGP2 =new ThreadGroup(pThreadGP ,"BANGLADESH");
	 
	 myThread t5 =new  myThread(cThreadGP2 , "DHAKA");
         myThread t6=new myThread(cThreadGP2 ,"MIRPUR");

	 t5.start();
	 t6.start();
       
	 System.out.println(pThreadGP.activeCount());
	 System.out.println(pThreadGP.activeGroupCount());

	 }}
