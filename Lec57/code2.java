class code2{
         int x = 10;
	 code2(){
	         System.out.println("In no argument");
	 }
	 code2(int x){
	          System.out.println("In para argument");
	 }
	 public static void main(String[]args){
	   code2 obj1 = new code2();
	   code2 obj2 = new code2(10);
	 }
}
