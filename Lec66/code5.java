interface Demo{
           void fun();
	   void gun();
}
abstract class Demochild implements Demo{
          public void gun(){
	        System.out.println("In gun");
	  }
}
class code5{
      public static void main(String[]args){
          Demo obj = new Demochild();
      }
}
