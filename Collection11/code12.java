//Runnable interface with annonymous inner class
class code12{
          public static void main(String[]aarsg){
		 Runnable obj1=new Runnable(){
			  public void run(){
				  System.out.println(Thread.currentThread().getName());
			  }
		 };
		 Runnable obj2= new Runnable(){
		          public void run(){
			          System.out.println(Thread.currentThread().getName());
			  }
		 };
		Thread t1=new Thread(obj1);

		t1.start();
	           
		Thread t2=new Thread(obj2);
		t2.start();
	  }
}
