interface Demo1{
       static void fun(){
             System.out.println("In fun");
       }
}
interface Demo2{
        static void fun(){
	    System.out.println("In fun demo2");
	}
}
class Demochild implements Demo1 , Demo2{
            void fun(){
	           System.out.println("In fun child");
	    }
}
class code16{
         public static void main(String[]args){
	       Demo1 obj = new Demochild();
	       obj.fun();
	 }
}
