class code12{
    int x = 10;
    static int y = 20;
    static {
          System.out.println("Static Block");
    
    }

 
    public static void main(String[]ars){
          System.out.println("Maim Method ");
	  code12 obj = new code12();
	 System.out.println(obj.x);
    }
    static {
       System.out.println("Static Block 2");
       System.out.println(y);
    }
}
