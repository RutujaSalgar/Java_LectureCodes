class Outer {
       int x =10;
       static int y=20;
        class Inner{
               int a =30;
       }
}
class code4{
       public static void main (String[]args){
             System.out.println(Outer.y);
	     Outer obj =new Outer();
	     System.out.println(obj.x);
	     System.out.println(obj.new Inner() .a);
       }
}
