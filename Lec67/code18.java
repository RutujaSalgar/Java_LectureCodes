interface Demo1{
      static void fun(){
          System.out.println("In fun");
      }
}
interface Demo2{
       static void fun(){
          System.out.println("In fun demo");
       }
}
class Demochild implements Demo1 ,Demo2{
           void fun(){
	     System.out.println("In fun Demochild");
	   
         Demo1.fun();
	 Demo2.fun();
}
}
class code18{
	public static void main(String[]args){
          Demochild obj = new Demochild();
           obj.fun();  
}}
