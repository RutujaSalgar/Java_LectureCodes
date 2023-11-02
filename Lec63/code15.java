class Demo{
       void fun(Object obj){
         System.out.println("Object");
       }
       
}
class code15{
         public static void main(String[]args){
          
         Demo obj = new Demo();
	  obj.fun( new StringBuffer("Core2web"));
	  
	 }
}
