class Parent{
          int x=10;
	  static int y=20;
	  void m1(){
	           System.out.println("In parent m1() ");
	  }
	  static void m2(){
	             System.out.println("In Parent m2() ");
	  }
	  Parent(){
	       System.out.println("In constructor");
	  }

}
class child extends Parent{
            int a=50;
	    static int b =60;
	    void m1(){
	            System.out.println("In m1 child");
	    }
	    static void m3(){
	             System.out.println("In m3 child");
	    }
	    child(){
	            System.out.println("In child constructor ");
	    }
}
class code1{
             public static void main(String[]args){
	          Parent obj =new Parent();
		  obj.m1();
		  obj.m2();
		  child obj1= new child();
		  obj1.m1();
		  obj1.m2();
		  Parent obj2= new child();
		  obj2.m1();
		  obj2.m2();
		  obj2.m3();
	     }
}
