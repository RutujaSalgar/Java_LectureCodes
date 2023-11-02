interface A{
       int x = 10;
}
interface B{
       int x = 20;
}
class child implements A, B {
           int x=30;
	   void fun(){
	            System.out.println(x);
		    System.out.println(A.x);
		    System.out.println(B.x);
	   }
}
class code9{
        public static void main(String[]args){
	          child obj =new child();
		  obj.fun();
	}
}
