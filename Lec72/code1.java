class Outer {
	     int x =10;
	     static int y=20;
	     void m1(){
	             int a =30;
		     static int b =30;
	     }
             public static void main(String[]args){
	          int p =50;
		  static int q =60;
	     }
}
//static method are not allowd in body or methods 
//static variables are only allowed in class because static variable initialize start first then static methods
//also in inner class static variables are not allowed
