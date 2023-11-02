//static modifier
class Parent{
	     static int x =10;
            static void fun(){
	             System.out.println("Parent fun");
	     }
}
/*class child extends Parent{
           void fun(){
	          System.out.println("Child fun");
	   }
}*/
class code7{
        public static void main(String[]args){
		Parent.fun();
		System.out.println(Parent.x);

	    // Parent p = new child();
	     //p.fun();
	}
}
