class Player{
          private int jerNo =18;  //instance variable ahe so constructor chya aat initialize hoil
	  private String name ="Virat";  //String Constant pool madhe initialize hoil && name is also instance variable ahe so tyala pn constructor chya aat jaga bhetel

	  Player(){
	            System.out.println("In constructor");
		    System.out.println(this);
	  }

	  void info(){
	            System.out.println(jerNo+" = " +name);
	  }
}
class code1{
          public static void main(String[]args){
	          Player obj1 =new Player();
		  obj1.info();

		  Player obj2=new Player();
		  obj2.info();

		  Player obj3=new Player();
		  obj3.info();
	  }
}
