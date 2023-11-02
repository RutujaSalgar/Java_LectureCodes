class Outer {
            class Inner{
	              void fun2(){
		                System.out.println("In fun2 Inner");
		      }
	    }
	    void fun1(){
	           System.out.println("In fun1 Outer");
	    }
}
class code4{
          public static void main(String[]args){
	        Outer obj=new Outer();


		obj.fun1();

		Outer.Inner obj2 =obj.new Inner();
		obj2.fun2();
	  }
}
