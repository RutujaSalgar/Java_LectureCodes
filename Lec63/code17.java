class Demo{
       void fun(Object obj){
         System.out.println("Object");
       }
       void fun(String str){
                 System.out.println("String");
       }
       
}
class code17
{
         public static void main(String[]args){
          
         Demo obj = new Demo();
	  obj.fun("Core2web");

	  obj.fun(new StringBuffer("core2web"));
	  obj.fun(null);
	  
	 }
}
