//Annonymous Inner class
class Demo{
          int x =10;
	  void marry(){
	         System.out.println("Kriti sanonon");
	  }
}
class code5{
          public static void main(String[]args){
	       Demo obj =new Demo(){
	                obj.marry();
			void marry(){
			     System.out.println("Disha Patani");
			}
	       };
	       obj.marry();
	  }
}
