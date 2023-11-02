class code1 extends Thread{
      public void run(){

	      System.out.println(getName());
      //        System.out.println(Thread.currentThread().getName());
      }
}
class threadGroupDemo{
            public static void main(String[]args){
	                  code1 obj1=new code1();
			  obj1.start();
			  System.out.println(Thread.currentThread().getThreadGroup());
			  System.out.println(obj1.getName());


			  obj1.setName("XYZ");
			    System.out.println(Thread.currentThread().getThreadGroup());
			                              System.out.println(obj1.getName()); 
						      System.out.println(Thread.currentThread().getThreadGroup());
			   			      System.out.println(obj1.getName());
	    }



}
