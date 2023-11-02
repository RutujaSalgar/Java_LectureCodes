class Demo{
       void fun(int x){
         System.out.println("In para");
       }
       void fun(char ch){
          System.out.println("char para");
       }
}
class code3{
         public static void main(String[]args){
	  Demo obj = new Demo();
	  obj.fun('A');
	 }
}
