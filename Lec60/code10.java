class Parent {
           static {
	       System.out.println("In Parent static block");
	   }
}
class child extends Parent{
       static {
              System.out.println("In child static block");
       }
}
class code10{
         public static void main(String[]args){
	      child obj = new child();
	 }
}
