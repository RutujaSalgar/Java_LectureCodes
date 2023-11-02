class code7{
  int x = 10;
  code7(){
         System.out.println("In constructor");
	 System.out.println(x);
	 System.out.println(this.x);
  }
  void fun(){
         System.out.println(this.x);
	 System.out.println(x);
  }
  public static void main(String[]args){
        code7 obj1 = new code7();
	obj1.fun();
  }
}
