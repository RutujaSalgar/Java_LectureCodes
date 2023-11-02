//Normal Inner class
class Outer{
      class Inner{
                void fun2(){
		       System.out.println("Fun 2 Inner");
		}
      }
      void fun1(){
              System.out.println("Fun 1 Outer");
      }
}
class code2{
            public static void main(String[]args){

		
	          Outer obj =new Outer ();
		  obj.fun1();

		  Outer.Inner obj1 =obj.new Inner();
		  obj1.fun2();

	    }
}
