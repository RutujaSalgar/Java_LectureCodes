class code4{
        int x = 10;
	code4(){
	         System.out.println("In constructor");
		 System.out.println(x);
	}
	public static void main(String[]args){
	      code4 obj1 = new code4();
	      obj1.x = 20;

	      code4 obj2 = new code4();
	}
}
