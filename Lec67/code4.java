interface Demo {
      void gun();

      default void fun(){
              System.out.println("In fun Demo ");
      }
}
class Demochild implements Demo{
          public  void gun(){
	        System.out.println("In gun Demochild");
	   }
}
class code4{
          public static void main(String[]args){
	     Demo obj = new Demochild();
	     obj.gun();
	     obj.fun();
	  }
}
