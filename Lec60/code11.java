class Parent{
           static int x = 10;
	   static {
	          System.out.println("In parent static block");
		  System.out.println(x);
	   }
}
class child extends Parent{
       static {
            System.out.println("In child static block");
	    System.out.println(x);
       }
}
class code11{
             public static void main(String[]args){
	       child obj = new child();
	     }
}
