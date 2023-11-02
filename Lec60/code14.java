class Parent{
     static int x =10;
     static {
           System.out.println("In parent static block");
     }
     static void access(){
           System.out.println(x);
     }
}
class child extends Parent{
   static {
         System.out.println("In child static block");
	 System.out.println(x);
	 access();
   }
}
class code14{
	public static void main(String[]aargs){
               System.out.println("In main");
	       child obj =new child();
}
}
