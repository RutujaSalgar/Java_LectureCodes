class code10{
    int x =10;
    static int y = 10;

    void fun(){
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
    }
    int z = 30;
    void gun(){
      fun();
    }
    public static void main(String[]args){
    
     code10 obj = new code10();
     obj.gun();
    }
}
