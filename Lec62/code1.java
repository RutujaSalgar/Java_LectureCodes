class Parent {
     Parent(){
             System.out.println("Parent constructor");
     }
     void fun(){
         System.out.println("In fun");
     }
}
class child extends Parent{
        child(){
	      System.out.println("In child constructor");
	}
}
class code1{
         public static void main(String[]args){
	         child obj = new child();
		 obj.fun();
	 }
}
