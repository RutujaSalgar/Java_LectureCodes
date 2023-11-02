interface Demo{
         default void fun(){
	     System.out.println("In fun");
	 }
}
class Demochild implements Demo{
              public void fun(){
	              System.out.println("Out");
	      }
}
class code6{
          public static void main(String[]args){
	      Demo obj = new Demochild();
	      obj.fun();
	  }
}
