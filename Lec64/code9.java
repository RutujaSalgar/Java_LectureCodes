//static modifier
class Parent{
	    
            static void fun(){
	             System.out.println("Parent fun");
	     }
}
class child extends Parent{
          static void fun(){
	          System.out.println("Child fun");
	   }
}
class code9{
        public static void main(String[]args){
            Parent obj =new Parent();
	    obj.fun();

	    child obj1= new child();
	    obj1.fun();

	    Parent obj3 =new child();
	    obj3.fun();
	}
}
