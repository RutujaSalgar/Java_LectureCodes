class code11{
     int x =10;
     static int y =20;
     static {
         System.out.println("Static Block");
     }
     public static void main(String[]args){
          System.out.println("Main Method");
     }
     static{
      System.out.println("Staic Block");
      System.out.println(x);
      System.out.println(y);
     }
}
