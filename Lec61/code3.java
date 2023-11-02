class Parent{
      int x =10;
      static int y =20;
      Parent(){
           System.out.println("Parent");
      }
}
class child extends Parent{
       int x =100;
       static int y = 200;
       child(){
               System.out.println("child");
       }
       void access(){
            System.out.println(super.x);
	    System.out.println(super.y);
	    System.out.println(x);
	    System.out.println(y);
	    System.out.println(this.x);
	    System.out.println(this.y);
       }
}
class code3{
       public static void main(String[]args){
          child obj = new child();
	  obj.access();
       }
}
