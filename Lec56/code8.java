class code8{
     int x = 10;
     code8(){
          System.out.println("In constructor");
	  System.out.println(this);
	  System.out.println(this.x);
     }
     void fun(){
          System.out.println(this);
	  System.out.println(x);
     }
     public static void main(String[]args){
      code8 obj1 = new code8();
      System.out.println(obj1);
      obj1.fun();
     }
}
