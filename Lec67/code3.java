class Demo{
         static void fun(){
	     System.out.println("In fun Demo");
	 }
}
class Demochild extends Demo{

}
class code3{
             public static void main(String[]args){
	      Demochild obj = new Demochild();
	      obj.fun();
	     }
}
