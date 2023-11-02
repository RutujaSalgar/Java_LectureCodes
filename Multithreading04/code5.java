//ThreadGroup
class myThread extends Thread{
	        myThread (String str){
		         super(str);
		}
                public void run(){
		       System.out.println(getName());
		       System.out.println(Thread.currentThread().getThreadGroup());
		}
		myThread(){
		         super();
		}
}
class code5{
             public static void main(String[]args){
	              myThread obj =new myThread("XYZ");
		      obj.start();

		      myThread obj1=new myThread("PQR");
		      obj1.start();

		      myThread obj2=new myThread();
		      obj2.start();
	     }
}
