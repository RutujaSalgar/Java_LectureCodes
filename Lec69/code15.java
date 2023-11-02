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
class code15{
             public static void main(String[]a){
		  Outer.Inner obj =new Outer().new Inner();//we use static so don't need to make of oject here
		   obj.m1();
	     }
}
