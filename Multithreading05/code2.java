class myThread extends Thread{
            public void run(){
	     System.out.println(Thread.currentThread());
	    }
            myThread(ThreadGroup tg ,String str){
	     super(tg, str);
	    }
}
class code2{
             public static void main(String[]args){
	        
	     ThreadGroup pThreadGP =new ThreadGroup("India");
	     
	     myThread t1=new myThread( pThreadGP , "MAHARASTRA");
	     myThread t2=new myThread( pThreadGP , "GOA");
	     
	     
	     t1.start();
	     t2.start();
	     
	     ThreadGroup cThreadGP =new ThreadGroup(pThreadGP ,"PAKISTAN");
	     
	     myThread t3=new myThread(cThreadGP ,"KARACHI");
	     myThread t4=new myThread(cThreadGP ,"LAHORE");
	     
	     t3.start();
	     t4.start();
	     }
}
