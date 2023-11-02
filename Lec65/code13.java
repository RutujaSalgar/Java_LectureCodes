class singleton{
         private singleton(){
	          System.out.println("Constructor");
	 }
}
class code13{
          public static void main(String[]args){
	    singleton obj = new singleton();
	    singleton obj1 =  new singleton();
	    singlgton obj2 = new singleton();
	  }
}
