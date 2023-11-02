import java.util.*;
class MyClass{
             String str =null;
              MyClass(String str){
	             this.str=str;
	      }
}
class Program12{
             public static void main(String[]args){
	      TreeSet ts=new TreeSet();
	     ts.add(new MyClass("Kanha"));
	     ts.add(new MyClass("Ashish"));
	     ts.add(new MyClass("Rahul"));
	     ts.add(new MyClass("Badhe"));
	     
	     System.out.println(ts);
	     }
}
