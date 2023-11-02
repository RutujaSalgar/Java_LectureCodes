class Demo{
       void fun(String str){
         System.out.println("String");
       }
       void fun(StringBuffer str1){
              System.out.println("StringBuffer");
       }
}
class code11{
         public static void main(String[]args){
          
          String str1 = null;
	  StringBuffer sb = null;

	  Demo obj = new Demo();
	  obj.fun("Core2web");
	  obj.fun(new StringBuffer("core2web"));
	 }
}
