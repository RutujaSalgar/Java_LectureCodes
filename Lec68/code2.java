interface demo1{
          static void fun(){
	      System.out.println("In static fun");
	  }
	  default void gun(){
	       System.out.println("In  gun deafult");
	  }
}
interface demo2{
          static void fun(){
	     System.out.println("In fun demo2");
	  }
	  default void gun(){
	      System.out.println("In gun default");
	  }
}
class demochild implements demo1 ,demo2{
        
	          void fun(){
		      System.out.println("In fun demochild");
		  }
	 }

class code2{
           public static void main(String[]args){
	       
	   }
}
