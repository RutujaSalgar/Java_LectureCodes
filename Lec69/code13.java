//Static Nested / Static inner class 
class Outer {
           void m1(){
	          System.out.println("In m1-Outer");
	   }
	   static class Inner{
	           void m1(){
		         System.out.println("In m1-Inner");
		   }
	   }
	   public static void main(String[]args){
	              Inner obj =new Inner();
		      obj.m1();
	   }
}
//jr static innner class lihla nasta tr 
//outer chya reference  vr object banvava lagla asta
//aani static ghosti acess krnya sathi object banvava lagt nhi
