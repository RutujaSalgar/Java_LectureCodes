class Outer{
     int x =10;
     int y =20;
     class Inner{
            void fun2(){
	           System.out.println("In fun2 Inner");
		   System.out.println(x);
		   System.out.println(y);
		   fun1();
	    }
     }
     void fun1(){
              System.out.println("Fun1 Outer");
     }
}
class code6{
        public static void main(String[]args){
	      Outer obj =new Outer();
	      Outer.Inner obj1=obj.new Inner();
	      obj1.fun2();
	}
}
