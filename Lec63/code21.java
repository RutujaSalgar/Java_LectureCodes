class Parent{
       void fun(){
         System.out.println("Parent");
       }
       
}
class child{
           void fun(){
	       System.out.println("Child fun");
	   }
	 
}
class code21{
         public static void main(String[]args){
          
         Parent obj = new child();
	
	 }
}
