interface demo{
       int x =10;
       void fun();
}
class demochild implements demo{
       public void fun(){
            System.out.println(x);
	    System.out.println(demo.x);
       }
}
class code7{
          public static void main(String[]args){
	  demo obj =new demochild();
	  obj.fun();
	  
	  }
}
