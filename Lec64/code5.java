class Parent{
             void fun(){
	             System.out.println("Parent fun");
	     }
}
class child extends Parent{
           private void fun(){
	          System.out.println("Child fun");
	   }
}
class code5{
        public static void main(String[]args){
	     Parent p = new child();
	     p.fun();
	}
}
