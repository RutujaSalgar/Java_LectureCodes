class Parent{
       char fun(){
         System.out.println("Parent fun");
	 return 'A';
       }
       
}
class child extends Parent{
           int fun(){
	       System.out.println("Child fun");
	       return 10;
	   }
	 
}
class code27{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
