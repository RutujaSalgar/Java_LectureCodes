import java.util.*;
class Movies{
       String movieName=null;
       double totColl=0.0;
       float imbRating=0.0f;
       Movies (String movieName ,double totColl ,float imbRating){
            this.movieName=movieName;
	    this.totColl=totColl;
	    this.imbRating=imbRating;
       }
       public String toString(){
              return "{" + movieName+" ," +totColl + " , " +imbRating+"}";
       }
}
class sortByName implements Comparator{
        public int compare(Object obj1,Object obj2){
	      return ((Movies)obj1).movieName.compareTo(((Movies)obj2).movieName);
	}
}
class sortByColl implements Comparator{
        public int compare(Object obj1 , Object obj2){
	      return (int)((((Movies)obj1 ).totColl) - (((Movies)obj2).totColl));
	}
}
class sortByImb implements Comparator{
        public int compare(Object obj1 ,Object obj2){
	      return (int)((((Movies)obj1).imbRating) - (((Movies)obj2).imbRating));
	}
}
class Program13{
         public static void main(String[]args){
	  ArrayList al=new ArrayList();
	  al.add(new Movies("RHTDM" ,200.0 ,8.8f));
	  al.add(new Movies("VED" , 100.0, 8.9f));
	  al.add(new Movies("SAIRAT" , 87.00 , 9.9f));
	  al.add(new Movies("GeetaGovindum" , 99.00,10.0f));

	  System.out.println(al);

	  Collections.sort(al,new sortByName());
	  System.out.println(al);

	  Collections.sort(al,new sortByColl());
	  System.out.println(al);

	  Collections.sort(al, new sortByImb());
	  System.out.println(al);


	 }
}

