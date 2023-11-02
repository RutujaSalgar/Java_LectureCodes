class Outer {
             void m1(){
	             System.out.println("In m1-Outer");
	     }
	     static class Inner{
	           void m1(){
		           System.out.println("In m1-Inner");
		   }
	     }
}
class code14{
             public static void main(String[]a){
		   Inner obj =new Inner();
		   obj.m1();
	     }
}
