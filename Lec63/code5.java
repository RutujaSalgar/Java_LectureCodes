class Demo{
       void fun(int x){
         System.out.println("Int para");
       }
       void fun(float ch){
          System.out.println("float para");
       }
}
class code5{
         public static void main(String[]args){
	  Demo obj = new Demo();
	  obj.fun(10.6);
	 }
}
