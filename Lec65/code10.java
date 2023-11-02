abstract class Parent {
          void career(){
	       System.out.println("Doctor");
	  }
	  void marry(){
	       System.out.println("Napoor");
	  }
}
class child extends Parent{
          void marry(){
	       System.out.println("Kriti");
	  }
}
class code10{
          public static void main(String[]args){
	          Parent obj = new child();
		  obj.career();
		  obj.marry();
	  }
}
