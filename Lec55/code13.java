class code13{
          int x =10;
	  code13(){
	     System.out.println("Constructor");
	  }
	  {
		  System.out.println("Instance Blcok");
	  
	  }
	  public static void main(String[]args){
	    code13 obj = new code13();
	    System.out.println("Main ");
	  }
	  {
		  System.out.println("Instance Block -2 ");
	  }
}
