class Demo{
          private int x = 10;
	 private static  int y = 20;

	  private void fun1(){
	     System.out.println(x);
	     System.out.println(y);
	 }
	  private static void fun2(){
	    System.out.println(x);
	    System.out.println(y);

	 }
}
class code4{
      public static void main(String[]args){
         Demo obj = new Demo();
	 obj.fun1();
	 obj.fun2();

      }
}
