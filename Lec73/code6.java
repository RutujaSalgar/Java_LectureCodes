class Outer{
          Object m1(){
	         System.out.println("M1 Outer");
		 class Inner{
		           void m1(){
			          System.out.println("m1 Inner");
			   }
		 }
		 return new Inner();
	  }
	  void m2(){
	      System.out.println("In m2 Outer");
	  }
}
class code5{
          public static void main(String[]args){
	     Outer obj =new Outer();
            // Object obj1 = obj.m1();
	     obj.m1().m1();
	  }
}
