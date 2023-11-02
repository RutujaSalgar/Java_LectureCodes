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
class code16{
             public static void main(String[]a){
		  Outer.Inner obj =new Outer.Inner(); //we dont create object of Outer class only take reference of Outer class
		   obj.m1();
	     }
}
