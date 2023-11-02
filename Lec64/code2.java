class Parent{
             public void fun(){
	             System.out.println("Parent fun");
	     }
}
class child extends Parent{
           void fun(){
	          System.out.println("Child fun");
	   }
}
class code2{
        public static void main(String[]args){
	     Parent p = new child();
	     p.child();
	}
}
