interface A{
       int x = 10;
}
interface B{
       int x = 20;
}
class child implements A, B {
          
	   void fun(){
	            System.out.println(x);
	   }
}
class code10{
        public static void main(String[]args){
	          child obj =new child();
		  obj.fun();
	}
}
