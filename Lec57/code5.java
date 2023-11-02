class code5{
            int x =10;
	    code5(){
	          System.out.println(this.x);
		  System.out.println(x);
		  System.out.println("In No args Constructor");
	    }
	    code5(int x ){
	        this.x = x ;
		this();
		System.out.println(this.x);
		System.out.println(x);
		System.out.println("In para  Constructor");
	    }
	    public static void main(String[]args){
	        code5 obj2 = new code5(50);
	    }
}
