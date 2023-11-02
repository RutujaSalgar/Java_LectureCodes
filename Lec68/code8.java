interface demo{
       int x =10;
       void fun();
}
class demochild implements demo{
	int y=x;//x is come here as value
       public void fun(){
            System.out.println(x);//here x is come as reference
	    System.out.println(demo.x);
       }
}
class code8{
          public static void main(String[]args){
	  demo obj =new demochild();
	  obj.fun();
	  
	  }
}
