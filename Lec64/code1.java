class parent{
           void fun(){
	         System.out.println("Parent Fun");
	   }
}
class child extends Parent{
           void fun(){
	         System.out.println("Child Fun ");
	   }
}
class code1{
           public static void main(String[]args){
	       Parent p =new child();
	       p.fun();//child fun
	   }
}
