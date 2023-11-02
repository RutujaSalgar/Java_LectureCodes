class Parent{
          static int x =10;
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
class code13{
          public static void main(String[]args){
	    System.out.println("In main");
	    child obj = new child();
	  }
}
