class code10{
     private int x = 10;
     code10(){
          
     }
     void fun(){
        System.out.println(x);
     }
}
class client{
   public static void main(String[]args){
     code10 obj1 = new code10();
     obj1.fun();
   }
}
