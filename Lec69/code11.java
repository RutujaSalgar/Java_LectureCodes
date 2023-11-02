//Method Local inner class
class Outer{
         void m1(){
	       System.out.println("In m1 outer");

	       class Inner{
	                 void m3(){
			         System.out.println("In m3 Inner");
			 }
	       }
	 }
	 void m2(){
	 
	          System.out.println("In m2 outer");
	 }
	 public static void main(String[]args){
	         Outer obj = new Outer ();
		 obj.m1();
		 obj.m2();
		
	 }
}
