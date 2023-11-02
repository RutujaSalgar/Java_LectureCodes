class Demo{
            Demo(){
	          System.out.println("In constructor Demo");
	    }

}
class Demochild extends Demo{
             Demochild(){
	             System.out.println("In constructor Demochild");
	     }
}
class Parent{
             Parent(){ 
	          System.out.println("In parent constructor");
	     }
	     Demo m1(){
	          System.out.println("In m1-parent"); 
		  return new Demo() ;
	     }
}
class child extends Parent {
	             child(){ 
		          System.out.println("In constructor child");
		     }
		     Demochild m1(){
		              System.out.println("In m1-child");
			      return  new Demochild();
		     }
	    }
class client{
         public static void main(String[]args){
	      Parent p=new Parent();  //ithun Parent chya constructor la jump (1)
	      p.m1();
	}
}
