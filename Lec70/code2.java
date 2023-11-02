class Parent{
             int x=10;
	  
	     void m1(){
	           System.out.println("In parent m1() ");
	  }

}
class child extends Parent{
             int a=20;
	     
	     void m1(){
	            System.out.println("In m1 child");
	    }
}
class code2{
             
	     code2(Parent p){
		              System.out.println("In constructor parent ");
		     
	               	      p.m1();
	     }
             code2(child c){
	                      System.out.println("In constructor child");

			      c.m1();
	     }
	     public static void main(String[]args){
	           code2 obj1=new code2(new Parent());

		   code2 obj2=new code2(new child());
	    
	     }
}
