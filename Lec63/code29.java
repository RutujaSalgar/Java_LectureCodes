class Parent{
       StringBuffer fun(){
         System.out.println("Parent fun");
	 return new StringBuffer("Shashi");
       }
       
}
class child extends Parent{
           String fun(){
	       System.out.println("Child fun");
	       return "shashi";
	   }
	 
}
class code29{
         public static void main(String[]args){
          
         Parent obj = new child();
	 obj.fun();
	 }
}
