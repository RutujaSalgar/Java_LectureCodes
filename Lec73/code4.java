class Outer{
        void m1(){
	     System.out.println("M1 Outer");
	     class Inner{
	               void m1(){
		                System.out.println("In m1 Inner");
		       }
	     }
	     Inner obj =new Inner();
	     obj.m1();
	}
	void m2(){
	      System.out.println("In m2 Outer ");
	}
}
class code4{
         public static void main (String[]args){
	      Outer obj =new Outer();
	      obj.m1();
	      obj.m2();
	 }
}
