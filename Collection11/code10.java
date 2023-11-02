//Runnable interface with lambda function
class demo implements Runnable{
                 public void run(){
		   System.out.println(Thread.currentThread().getName());
		 }
}
class code10{
          public static void main(String[]aarsg){
	        demo obj1=new demo();
		Thread t1=new Thread(obj1);

		demo obj2=new demo();
		Thread t2=new Thread(obj2);

		t1.start();
		t2.start();
	  }
}
