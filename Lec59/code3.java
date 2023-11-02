class Parent {
         Parent(){
	          System.out.println("In parent Constructor");
	 }
	 void parentProperty(){
	      System.out.println("Flat , Car , Gold ");
	 }
}
class Child extends Parent{
           Child(){
	      System.out.println("In Child constructor");
	   }
}
class code3{
       public static void main(String[]args){
            Parent obj1 = new Parent();
	    Child obj2 = new Child();
	    obj2.parentProperty();
       
       }
}
