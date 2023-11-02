interface Demo1{
    static    void m1(){
               System.out.println("Demo m1");
      }
}
interface Demo2{
        static  void m1(){
	     System.out.println("Demo m2 " );
	}
}
interface Demo3 extends Demo1 ,Demo2{

}
