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
class code12{
         public static void main(String[]args){
	       outer.inner obj = new outer().new inner();
	      
	       obj.m1();
	 }
}
