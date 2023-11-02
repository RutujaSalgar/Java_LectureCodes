class Parent{
          Parent(){
	   System.out.println("Parent");
	  }
	  void property(){
	       System.out.println("Home");
	  }
	  void marry(){
	       System.out.println("Deepika");
	  }
}
class child extends Parent{
         child(){
	        System.out.println("child constructor");
	 }
	 void marry(){
	   System.out.println("Alia Bhatt");
	 }
}
class code2{
           public static void main(String[]args){
	        child obj = new child();
		obj.property();
		obj.marry();
	   }
}
