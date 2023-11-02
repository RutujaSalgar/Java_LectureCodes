class Parent{
          Parent(){
	   System.out.println("Parent");
	  }
	  void fun(){
	         System.out.println("In fun");
	  }
}
class child extends Parent{
         child(){
	        System.out.println("child constructor");
	 }
	 void gun(){
	   System.out.println("In gun");
	 }
}
class code5{
           public static void main(String[]args){
	        Parent obj1 =new child();
		obj1.fun();
		
	   }
}
