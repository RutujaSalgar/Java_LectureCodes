class Parent{
       void fun(){
         System.out.println("Parent fun");
       }
       
}
class child extends Parent{
           void fun(){
	       System.out.println("Child fun");
	   }
	 
}
class code23{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
