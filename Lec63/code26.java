class Parent{
       int fun(){
         System.out.println("Parent fun");
	 return 10;
       }
       
}
class child extends Parent{
           char gun(){
	       System.out.println("Child fun");
	       return 'A';
	   }
	 
}
class code26{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
