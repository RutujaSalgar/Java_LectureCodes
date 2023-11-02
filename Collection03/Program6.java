import java.util.*;
class CricPlayer{
            String name=null;
            int jerNo=0;
          CricPlayer(int jerNO ,String name){
	         this.jerNo=jerNo;
	         this.name=name;
	  }
	  public String toString(){
	         return name;
	  }
}
class Program6{
             public static void main(String[]args){
	     ArrayList al=new ArrayList();
	     al.add(new CricPlayer(18 ,"Virat"));
	     al.add(new CricPlayer(7 ,"MSD"));
	     al.add(new CricPlayer(45 ,"Rohit"));

	     System.out.println(al);
	     
	     }}
