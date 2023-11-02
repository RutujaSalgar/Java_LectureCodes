class Program3{
              void m1(){
	       System.out.println("In M1");
	      }
	      void m2(){
	       System.out.println("In m2");
	      }
	      public static void main(String []ath){
	      System.out.println("Start Main");
	      Program3 obj=new Program3();
	      obj.m1();
	      obj=null;
	      obj.m2();
	      System.out.println("End main");
	      }
}
