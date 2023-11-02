class Outer{
        class Inner{
	           void m1(){
		            System.out.println("In inner m1");
		   }
	}
	void m2(){
	         System.out.println("Outer M2() ");
	}
	public static void main(String []args){
	        Inner obj=new Inner();
		obj.m1();
	}
}
