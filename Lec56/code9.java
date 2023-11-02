class code9{
      code9(){
             System.out.println("No argument");
      }
      code9(int x){
            System.out.println("Para");
      }
      code9(code9 xyz){
          System.out.println("Para code9");
      }
      public static void main(String[]args){
             code9 obj1 = new code9();
	     code9 obj2 = new code9(10);
	     code9 obj3 = new code9(obj1);
      }
}
