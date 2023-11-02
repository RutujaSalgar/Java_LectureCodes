class Parent{
         static int x = 10;
	 static {
	        System.out.println("In parent static block");
	 }
}
class child extends Parent{
      static {
            System.out.println("In child static block");
      }
      public static void main(String[]args){
               System.out.println("In main");
      }
}
