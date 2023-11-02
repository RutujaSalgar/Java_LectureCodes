class code4{
            int x = 10;
	    code4(){
	         System.out.println(this.x);
		 System.out.println(x);
		 System.out.println("In No Argument Constructor");
	    }
	    code4(int x){
	         System.out.println(this.x);
		 System.out.println(x);
		 System.out.println("In para Constructor");
	    }
	    public static void main(String[]ars){
	           code4 obj1 = new code4();
		   code4 obj2 = new code4(50);

	    }
}
