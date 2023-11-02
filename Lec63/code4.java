class Demo{
       void fun(int x){
         System.out.println("In para");
       }
       void fun(float ch){
          System.out.println("char para");
       }
}
class code4{
         public static void main(String[]args){
	  Demo obj = new Demo();
	  obj.fun('A');
	 }
}
