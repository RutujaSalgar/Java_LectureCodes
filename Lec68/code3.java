interface demo1{
          default void gun(){
	          System.out.println("In gun demo");
	  }
}
class demochild implements demo1{
           public void gun(){
	        System.out.println("In gun demochild");
	   }
}
class code3{
            public static void main(String[]args){
           demo9 obj =new demochild();
		   obj.gun();
	    }
}
