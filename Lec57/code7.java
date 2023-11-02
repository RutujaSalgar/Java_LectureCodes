class code7{
	int x = 10;

     code7(){
	     this(70);
              System.out.println("In No Argument Constructuor");
     }
     code7(int x){
              this();
	      System.out.println("In Para Constructor");
     }
     public static void main(String[]args){
         code7 obj1 = new code7(50);
     }
}
