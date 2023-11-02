class Demo{
         int x = 10;
	 static int y = 20;

	 void fun1(){
	     System.out.println(x);
	     System.out.println(y);
	 }
	 static void fun2(){
	    System.out.println(x);
	    System.out.println(y);

	 }
}
class code3{
      public static void main(String[]args){
         
	 Demo.fun1();
	 Demo.fun2();
      }
}
