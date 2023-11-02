class myThread extends Thread{
       myThread(ThreadGroup tg,String str){
                super(tg ,str);
       }     
       
	public void run (){
         System.out.println(Thread.currentThread());
      }
}
class ThreadGroupDemo{
         public static void main(String[]args){
	 
	 ThreadGroup  pThreadGP=new ThreadGroup("India");
	 myThread t1=new myThread(pThreadGP ,"MH");
	 myThread t2=new myThread(pThreadGP , "Goa");

	 t1.start();
	 t2.start();
	 }
}

	

