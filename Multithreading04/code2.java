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
class code2{
             public static void main(String[]args){
	              myThread obj =new myThread("XYZ");
		      obj.start();
	     }
}
