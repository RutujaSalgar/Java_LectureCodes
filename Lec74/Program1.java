//Default Exception Handler
class Program1{
             void m2(){
	        System.out.println("In M2");
	     }
	     void m1(){
	        System.out.println(10/0);
	     m2();
	     }

	     public static void main(String[]args){
	              Demo obj=new Demo();
	     obj.m1();
	     }
}
