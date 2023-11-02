class Parent{
        int x =10;
	static int y =20;

	Parent(){
	   System.out.println("Parent");
	}

	void fun(){
	   System.out.println("In Fun");
	}

	static void run(){
	    System.out.println("In static run");
	}
}
class child extends Parent{
     void gun(){
         System.out.println("In gun");
     }
}
class code1{
    public static void main(String[]at){
        child obj = new child();
	System.out.println(obj.x);
	System.out.println(obj.y);
	obj.fun();
	obj.run();
	obj.gun();
    }
}
