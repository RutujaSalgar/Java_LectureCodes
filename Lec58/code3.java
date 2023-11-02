class Player{
        private int jerNo = 0 ;
	private String name = null;
	Player(int jerNo , String pName){
	  this.jerNo =jerNo;
	  this.name= pName;
	  System.out.println("In constructor");
	}
	void info(){
	    System.out.println(jerNo + " = " + name);
	}
}
class code3{
        public static void main(String[]args){
	   Player obj1 = new Player(7 , "MSD" );
	   obj1.info();
	   Player obj2 = new Player(18 , "Virat");
	   obj2.info();
	   Player obj3 = new Player (45 , "Rohit");
           obj3.info();
	}
}
