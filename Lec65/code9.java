abstract class Parent{
          void career(){
	            System.out.println("Doctor");
	  }
	  abstract void marry();
}
class child extends Parent{
           void marry(){
	             System.out.println("Deepika");
	   }
}
class code9{
          public static void main(String[]args){
	       Parent p = new child() ;
	       p.career();
	       p.marry();
	  }
}
