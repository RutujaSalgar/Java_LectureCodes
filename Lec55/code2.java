class Demo{
   static {
       System.out.println("Static Block - 1");
   }
}
class code2{
     static{
         System.out.println("Static Block - 2");
     }
     public static void main(String[]args){
           System.out.println("In Main ");
     }
     static {
       System.out.println("Static Block -3 ");
     }
}
