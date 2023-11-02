class Parent{
       void fun(){
         System.out.println("Parent fun");
	 return 10;
       }
       
}
class child extends Parent{
           char fun(){
	       System.out.println("Child fun");
	       return 'A';
	   }
	 
}
class code25{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
