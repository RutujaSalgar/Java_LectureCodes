interface Demo1{
        default void fun(){
	     System.out.println("In fun Demo");
	}
}
interface Demo2{
        default void fun(){
	     System.out.println("In fun Demo");
	}
}
class Demochild implements Demo1 , Demo2{
      public void fun(){
	    System.out.println("In fun Demochild");
	}
}
class code9{
     public static void main(String[]args){
          Demochild obj = new Demochild();
	  obj.fun();

	  Demo1 obj1 =new Demochild();
	  obj1.fun();

	  Demo2 obj2 = new Demochild();
	  obj2.fun();
     }
}
