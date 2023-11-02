//ThreadGroup
class myThread extends Thread{
	        myThread (ThreadGroup tg){
		         super(tg);
		}
        
}
class code6{
             public static void main(String[]args){
	             ThreadGroup pThreadGP=new ThreadGroup("Core2web");

		     myThread obj1=new myThread();

		     myThread obj1=new myThread(pThreadGP);

		     System.out.println(obj1.getThreadGroup());
	     }
}
