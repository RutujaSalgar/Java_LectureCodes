interface Demo{
 static void fun(){
         System.out.println("In fun");

 }
}
class Demochild implements Demo{

}
class code14{
         public static void main(String[]args){
	     Demo.fun();
	 }
}
