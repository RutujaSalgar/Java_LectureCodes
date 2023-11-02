class myThread extends Thread{
                  myThread (String str){
		        super(str);
		  }
		  public void run(){
		       System.out.println(getName());
		       System.out.println(Thread.currentThread().getThreadGroup());
		  }
		  myThread (){
		  super();
		  }
			       
}
class ThreadGroupDemo{
        public static void main(String[]args){
	          myThread obj=new myThread("XYZ");
		  obj.start();
		  

		  myThread obj1=new myThread("PQR");
		  obj1.start();


		  myThread obj2=new myThread();
		  obj2.start();

		   myThread obj3=new myThread();
		                     obj3.start();


				      myThread obj4=new myThread("RAM");
				                        obj4.start();
	}
}
   
