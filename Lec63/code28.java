class Parent{
       Object fun(){
         System.out.println("Parent fun");
	 return new Object();
       }
       
}
class child extends Parent{
           String fun(){
	       System.out.println("Child fun");
	       return "shashi";
	   }
	 
}
class code28{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
