class Outer {
            class Inner {
	           void m1(){
		         System.out.println("In inner class ");
		   }
	    }
	   void m2(){
	            System.out.println("Inner m2");
	   }

           public static void main(String[]args){
//	         Outer obj =new Outer ();
		 obj.m2();
	   }
}
