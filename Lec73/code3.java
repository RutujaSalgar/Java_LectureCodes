class Outer{
            void m1(){
	            System.out.println("In m1 Outer");
		    class Inner{
		          void m1(){
			           System.out.println("In m1 Inner");
				   class Inner2{
				   
				   }
			  }
		    }
	    }
}
class code3{
           public static void main(String[]args){
	       Outer obj =new Outer();
	       obj.m1();
	       obj.m1();
	   }
}
//if one class is depend on functionality then that class should 
//have be write in method .until we do not call method class is also not be accessible
//if we have to access class we need to create object inside method 
