class singleton{
          singleton(){
	           System.out.println("Constructor");
	  }
}
class code12{
          public static void main(String[]args){
	    singleton obj=new singleton();
	    singleton obj1 = new singleton();
	    singleton obj2 = new singleton();
	  }
}
