class Outer {
            class Inner {
	           void m1(){
		         System.out.println("Inner m1()");
		   }
	    }
	   void m2(){
	            System.out.println("Outer m2");
	  }
}
class code6{

           public static void main(String[]args){
	         Outer obj =new Outer ();
		 obj.m2();
                 
	       Outer.Inner obj1 = new Outer().new Inner();	 
//		 Outer.Inner obj1=obj.new Inner();
		 obj1.m1();
		
	   }
}
