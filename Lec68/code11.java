//Inner class
//1) Normal inner class
class outer{
           class inner{
	               void m1(){
		             System.out.println("In m1 Inner");
		       }
	   }
	   void m2(){
	                System.out.println("In m2 Outer");
	   }
}
class code11{
         public static void main(String[]args){
	       Outer obj = new Outer();
	       obj.m2();
	       obj.m1();
	 }
}
