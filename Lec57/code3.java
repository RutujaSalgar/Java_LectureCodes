class code3{
          int x = 10;
	  code3(){
	          System.out.println("In No Argument");
	  }
	  code3(int x){
	           System.out.println("In Para constructor");
	  }
	  public static void main(String[]args){
	          code3 obj1 = new code3();
		  code3 obj2 = new code3(10);
	  }
}
