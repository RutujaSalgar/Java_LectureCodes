interface Demo1{
            default void fun(){
	         System.out.println("In fun Demo1");
	    }
}
interface Demo2{
            default void fun(){
	         System.out.println("In fun Demo2 ");
	    }
}
class childDemo implements Demo1 ,Demo2{


}
class code8{
         public static void main(String[]args){
	     childDemo obj =new childDemo();
	     obj.fun();
	 }
}
