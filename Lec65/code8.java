abstract class Parent {
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
class code8{
          public static void main(String[]args){
	     child obj =new child();
	     obj.marry();
	     obj.career();
	  }
}
