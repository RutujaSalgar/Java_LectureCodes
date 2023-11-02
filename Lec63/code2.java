class match{
       void matchType(){
            System.out.println("T20 / OneDay /Test ");
       }
}
class IPLMatch extends match{
         void matchType(){
	       System.out.println("T2o");
	 }
}
class testMatch extends match{
        void matchType(){
	      System.out.println("Test");
	}
}
class code2{
       public static void main(String[]args){
            match type1 = new match();
	    type1.matchType();
       }
}
