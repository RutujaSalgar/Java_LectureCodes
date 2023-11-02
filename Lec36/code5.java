class code5{
	public static void main(String[]args){
   int x = 200;
   int y = 200;
   Integer z = 200;
   Integer a = new Integer(200);

   System.out.println(System.identityHashCode(x));
   System.out.println(System.identityHashCode(y));
   System.out.println(System.identityHashCode(z));
   System.out.println(System.identityHashCode(a));
}
}
