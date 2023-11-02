//Method Local inner class
class Outer{
         void m1(){
	       System.out.println("In m1 outer");

	       class Inner{
	                 void m1(){
			         System.out.println("In m1 Inner");
			 }
	       }
	       Inner obj =new Inner();
	       obj.m1();
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
//Method local inner class lihla tr innner class madhil methods acess kraychya astil tr inner class madhech object banvaycha tithun ch acess kraycha
