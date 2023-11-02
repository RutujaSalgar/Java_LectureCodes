class Program2{
	   void m2(){
	         System.out.println("Start m2");
	   System.out.println(10/0);
	   System.out.println("End  main");
	   }
	   void m1(){
	          System.out.println("Start m1");
		 
	          m2();
	          System.out.println("End main");
	   }
           public static void main(String[]args){
	       System.out.println("Start Main");
	       Program2 obj=new Program2();
	       obj.m1();
	       System.out.println("End Main");
	   }
}
