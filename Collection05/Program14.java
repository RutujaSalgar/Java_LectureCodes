import java.util.*;
class MyClass implements Comparable{
              String str= null;
             MyClass(String str){
	           this.str=str;
	     }
             public String toString(){
	            return   "Name "+ ":"+ str;
	     }
             public int compareTo(Object str){
	     
	     }
}

class Program14{
              public static void main(String[]args){
	        TreeSet ts =new TreeSet();
	        ts.add(new MyClass("Kanha"));
	        ts.add(new MyClass("Rahul"));
	        ts.add(new MyClass("Ashish"));
	        ts.add(new MyClass("Badhe"));

		System.out.println(ts);
	      
	      }}
