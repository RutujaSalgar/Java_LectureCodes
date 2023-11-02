interface Demo{
      static void fun(){static void fun(){static void fun(){
          System.out.println("In fun");

       }
}
class Demochild implements Demo{

}
class code13{
      public static void main(String []args){
          Demo obj = new Demochild();
	  obj.fun();
      }
}
