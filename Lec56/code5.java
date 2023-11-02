class code5{
        int x = 10;
	code5(){
	         System.out.println("In constructor");
	//	 System.out.println(x);
	}
	void fun(){
	       System.out.println(x);
	}
	public static void main(String[]args){
	      code4 obj1 = new code4();
	      obj1.fun();
//	      code4 obj2 = new code4();
	}
}
