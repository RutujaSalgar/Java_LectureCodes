class Outer{
         void m1(){
	         System.out.println("In m1() Outer ");
		 class Inner{
		          void m2(){
			          System.out.println("In m1 Inner");
			  }
		 }
		 class Inner2{
		 
		 }
	 }
	 void m2(){
	           System.out.println("In m2 Outer ");
	 }
}
class code1{
          public static void main(String[]args){
	       Outer obj = new Outer();
	       obj.m1();
	       obj.m2();
	  }
}
