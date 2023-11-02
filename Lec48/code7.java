class code7{
     code7(){
              System.out.println("In constructor");
     }
     void fun(){
         code7 obj = new code7();
     }
     public static void main(String[]arg){
       code7 obj = new code7();
       code7 obj1 = new code7();

       obj.fun();
     }
}
