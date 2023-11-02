class code8{
	int x = 10;

     code8(){
	     this(70);
              System.out.println("In No Argument Constructuor");
     }
     code8(int x){
              super();
	      System.out.println("In Para Constructor");
     }
     public static void main(String[]args){
         code8 obj1 = new code8(50);
     }
}
