interface Demo{
         static void fun(){
	         System.out.println("In fun");
	 }
}
class Demochild implements Demo{


}
class code11{
      public static void main(String[]args){
         Demochild obj =new Demochild();
	 obj.fun();
      }
}

