import java.util.*;
class Program14{
                public static void main(String[]args){
		
		SortedSet ss=new TreeSet();
		 
		ss.add("Kanha");
		ss.add("Rajesh");
		ss.add("Rahul");
		ss.add("Ashish");
		ss.add("Badhe");
		
		System.out.println(ss);

		//headSet
		System.out.println(ss.headSet("Kanha"));

		//tailSet
		System.out.println(ss.tailSet("Kanha"));

		//subSet
		System.out.println(ss.subSet("Ashish" , "Rahul"));

		//first
		System.out.println(ss.first());

		//last
		System.out.println(ss.last());

		System.out.println(ss);

		}
}
