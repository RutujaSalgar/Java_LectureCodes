interface Demo1{
           static void m1(){
	          System.out.println("Demo m1");
	   }
}
interface Demo2{
         static void m1(){
	          System.out.println("Demo m1");
	 }
}
interface Demo3 extends Demo1, Demo2{

}
class Demochild implements Demo3{
         public static void main(String[]aigs){
	    //   Demochild obj = new Demochild ();
	    Demo1 obj = new Demochild();
		Demo1.m1();
		Demo.m1();

	 }
}
