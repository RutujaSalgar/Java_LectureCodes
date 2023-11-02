class Demo{
       void fun(int x , float y){
         System.out.println("Int float para");
       }
       void fun(float ch , int y){
          System.out.println("float Int para");
       }
}
class code6{
         public static void main(String[]args){
	  Demo obj = new Demo();
	  obj.fun(10 , 10);
	 }
}
