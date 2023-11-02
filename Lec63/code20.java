class Parent{
       void fun(){
         System.out.println("Parent");
       }
       
}
class child extends Parent{
           void fun(){
	       System.out.println("Child fun");
	   }
	   void gun(){
	        
	   }
}
class code20{
         public static void main(String[]args){
          
         Parent obj = new Parent();
	 obj.fun();
	 

	 child obj1 =new child();
	 obj1.fun();
	 obj1.gun();
	 }
}
