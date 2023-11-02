class Parent{
          Parent(){
	   System.out.println("Parent constructor");
	  }
	  void fun(int x){
	         System.out.println("In Parent fun");
	  }
}
class child extends Parent{
         child(){
	        System.out.println("child constructor");
	 }
	 void fun(int x){
	   System.out.println("In child fun");
	 }
}
class code8{
           public static void main(String[]args){
	        Parent obj1 =new child();
		obj1.fun();
		
	   }
}
