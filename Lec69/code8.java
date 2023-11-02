class Outer {
            class Inner {
	               void m1(){
		              System.out.println("In inner m1() ");
		       }
	    }
	    void  m2(){
	               System.out.println("In Outer m2()");
	    }
	    public static void main(String []args){
	        Outer.Inner obj =new Outer().new Inner();
		obj.m1();


	    }
}
