class Parent{
       int fun(){
         System.out.println("Parent fun");
	 return 10;
       }
       
}
class child extends Parent{
           int fun(){
	       System.out.println("Child fun");
	       return 20;
	   }
	 
}
class code24{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
