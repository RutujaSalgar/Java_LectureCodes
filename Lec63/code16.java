class Demo{
       void fun(Object obj){
         System.out.println("Object");
       }
       
}
class code16{
         public static void main(String[]args){
          
         Demo obj = new Demo();
	  obj.fun( null);
	  
	 }
}
