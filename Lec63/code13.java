class Demo{
       void fun(Object obj){
         System.out.println("Object");
       }
       void fun(String str1){
              System.out.println("String");
       }
}
class code13{
         public static void main(String[]args){
          
         Demo obj = new Demo();
	  obj.fun("Core2web");
	  
	 }
}
