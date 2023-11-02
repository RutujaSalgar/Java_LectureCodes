import java.util.*;
class CricPlayer{
               String name=null;
               int jerNo=0;
               CricPlayer(int jerNo ,String name){
	             this.name=name;
	             this.jerNo=jerNo;
	       }
	       public String toString(){
	          return name+ " : "+ jerNo ;
	       }
}             
class Program6{
           public static void main(String[]args){
	   ArrayList al=new ArrayList();
	   al.add(new CricPlayer(18 ,"Virat"));
	   al.add(new CricPlayer (7 ,"MSD"));
	   al.add(new CricPlayer(45 ,"Rohit"));
	   
	   System.out.println(al);

	   al.add(1 ,"Hardik"); // 1 index la hardik add hoil  MSD chya jagi mhnje output madhe Hardik , MSD : 7 as yeil
	   System.out.println(al);

	   al.add(1 ,33);
	   System.out.println(al);//1 st index chya name madhe 33 add hoil mhnjech output 33 , Hardik ,MSD :7 as yeil

	  al.add(1 ,new CricPlayer(33, "Hardik"));// 1 st index la  Hardik:33 as add hoil
           System.out.println(al);


	   }
}
