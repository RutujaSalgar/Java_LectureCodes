//ThreadGroup
class myThread extends Thread{
	        myThread (String str){
		         super(str);
		}
                public void run(){
		       System.out.println(getName());
		       System.out.println(Thread.currentThread().getThreadGroup());
		}
}
class code4{
             public static void main(String[]args){
	              myThread obj =new myThread("XYZ");
		      obj.start();

		      myThread obj1=new myThread("PQR");
		      obj1.start();

		      myThread obj2=new myThread("PQR");
		      obj2.start();
	     }
}
