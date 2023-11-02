class Parent{
      static {
            System.out.println("In parent static block");
      }
}
class child{
       static {
             System.out.println("In child static block");
       }
}
class code7{
       public static void main(String[]args){
                child obj =new child();
		Parent obj2 = new Parent();
       }
}
