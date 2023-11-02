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
class code2{
    public static void main(String[]at){
        Parent pobj = new Parent();
	System.out.println(pobj.x);
	System.out.println(pobj.y);
	pobj.fun();
	pobj.run();
	//pobj.gun();
    }
}
