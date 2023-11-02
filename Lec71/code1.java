//Normal Inner class
class Outer{
      class Inner{
                void fun2(){
		       System.out.println("Fun 2 Inner");
		}
      }
      void fun1(){
              System.out.println("Fun 1 Inner");
      }
}
class code1{
            public static void main(String[]args){

		
	          Outer obj =new Outer ();
		  Inner obj1 = obj.new Inner();

		  //:wq
	//obj.Inner obj1 =obj.new Inner();
	    }
}
