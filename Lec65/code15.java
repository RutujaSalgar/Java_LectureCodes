class singleton{
            static singleton obj = new singleton();

	    private singleton(){
	       System.out.println("Constructor");
	    }

	    static singleton getObject(){
	           return obj ;
	    }
}
class code15{
          public static void main(String[]args){
	      singleton obj1 = singleton.getObject();
	      System.out.println(obj1);

	      singleton obj2 = singleton.getObject();
	      System.out.println(obj2);

	      singleton obj3 =  singleton.getObject();
	      System.out.println(obji3);
	  }
}
