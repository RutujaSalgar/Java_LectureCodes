class Parent{
       void fun(){
         System.out.println("Parent");
       }
       
}
class child extends Parent{
           void fun(){
	       System.out.println("Child fun");
	   }
	 
}
class code22{
         public static void main(String[]args){
          
         Parent obj = new child();
	
	 }
}
