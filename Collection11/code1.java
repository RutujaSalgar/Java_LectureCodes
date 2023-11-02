import java.util.*;
class core2web{
            void lang(){
	          System.out.println("Bootcamp/java");
	    } 
}
class code1{
           public static void main(String[]args){
	   core2web c2w =new core2web(){
	        void lang(){
		     System.out.println("Bootcamp/Java/Python");
		}
	   };
	   c2w.lang();
	   
	   }
}
