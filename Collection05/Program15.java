import java.util.*;
class MyClass implements Comparable{
          String str =null;
           MyClass(String str){
	          this.str=str;
	   }
           public int compareTo(Object obj){
	          return -1;
	   }
}
class Program15{
              public static void main(String[]args){
	       TreeSet ts= new TreeSet();
	        ts.add(new MyClass("Kanha"));
		ts.add(new MyClass("Rahul"));
		ts.add(new MyClass("Ashish"));
		ts.add(new MyClass("Badhe"));

		System.out.println(ts);
	      
	      
	      }}
