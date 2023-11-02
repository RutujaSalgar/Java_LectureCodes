//static Inner class
class Outer {
       static class Inner{
             void m1(){
	              System.out.println("In m1");
	     }
       }
}
class code7{
         public static void main(String[]args){
	      Outer obj =new Outer();
	      Outer.Inner obj1 = obj.new Inner();
	      obj1.m1();
	 }
}
