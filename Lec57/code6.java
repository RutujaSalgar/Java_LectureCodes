class code6{
     code6(){
              System.out.println("In No Argument Constructuor");
     }
     code6(int x){
              this();
	      System.out.println("In Para Constructor");
     }
     public static void main(String[]args){
         code6 obj1 = new code6(50);
     }
}
