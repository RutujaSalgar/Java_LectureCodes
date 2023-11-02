class Outer{
           void m1(){
	             System.out.println("In m1 Outer");
	   
	   class Inner{
	               class Inner2{//Outer$1Inner$Inner$2.class
		       
		       }
	   }
	   }
	   void m2(){
	             System.out.println("In m2 Outer");
	   }
}
class code2{
            public static void main(String[]args){
	     Outer obj =new Outer();
	     obj.m1();
	     obj.m2();
	    }
}
