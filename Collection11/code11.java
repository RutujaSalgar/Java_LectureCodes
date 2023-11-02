//Runnable interface with lambda function
class code11{
          public static void main(String[]aarsg){
		 Runnable obj1=new Runnable(){
			  public void run(){
				  System.out.println(Thread.currentThread().getName());
			  }
		 };
		Thread t1=new Thread(obj1);

		t1.start();
	
	  }
}
