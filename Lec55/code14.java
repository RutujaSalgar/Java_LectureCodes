class code14{
          int x =10;
	  static int y = 20;
	  code14(){
	     System.out.println("Constructor");
	  }
	  static {
	    System.out.println("In static Block-1");
	  }
	  {
		  System.out.println("Instance Blcok");
	  
	  }
	  public static void main(String[]args){
		  System.out.println("In main");
	    code14 obj = new code14();
	    
	  }
	  static{
	   System.out.println("In static blcok");
	  }
	  {
		  System.out.println("Instance Block -1 ");
	  }
}
