abstract class Parent{
              void career(){
	           System.out.println("Doctor");
	      }
	      abstract void marry();
}
abstract class child extends Parent {

}
class code7{
            public static void main(String[]args){
	      Parent P = new Parent();
	      child c  =  new child();
	    }
}
