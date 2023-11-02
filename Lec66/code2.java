interface Demo{
       void fun();//public abstract
       void gun();//public abstract
}
class Demochild implements Demo{
         void fun(){
	         System.out.println("In fun");
	 }            
	 void gun(){
	         System.out.println("In gun");
	 }
}
