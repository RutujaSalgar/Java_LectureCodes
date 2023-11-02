class singleton{
            static singleton obj = new singleton();

	    private singleton(){
	       System.out.println("Constructor");
	    }

	    static singleton getObject(){
	           return obj ;
	    }
}
class code14{
          public static void main(String[]args){
	      singleton obj1 = singleton.getObject();
	      System.out.println(obj1);
	  }
}
