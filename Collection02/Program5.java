import java.util.*;
class ArrayListDemo extends ArrayList{
              public static void main(String[]args){
	      ArrayListDemo al=new ArrayListDemo();
	      al.add(10);
	      al.add(20.5f);
	      al.add("Shashi");
	      al.add(10);
	      al.add(20.5f);

	      System.out.println("1......Printing of list");
	      System.out.println(al);
	      
              //indexOf
	      System.out.println("2......IndexOf");
	      System.out.println(al.indexOf(20.5f));

	      //lastIndexOf
	      System.out.println("3......lastIndexOf");
	      System.out.println(al.lastIndexOf(20.5f));

	      //get(int)
	      System.out.println("4.......get(int)");
	      System.out.println(al.get(3));

	      //set(int ,E)
	      System.out.println("5.......set(int ,E)");
	      System.out.println(al.set(3,"Incubator"));

	      //void add(int ,E);
	      System.out.println("6.......add(int ,E)");
	      al.add(3 ,"Core2web");

	      //remove(int)
	      System.out.println("7........remove(int)");
	      System.out.println(al.remove(4));

	      //boolean remove(java.lang.Object)
	      System.out.println("8........boolean remove (java.lang.Object)");
	      System.out.println(al.remove("Shashi"));

	      //void clear
	      System.out.println("9.......void clear");
	      al.clear();
	      System.out.println(al);


	      ArrayList al2=new ArrayList();
	      al2.add(30);
	      al2.add(40);
	      al2.add(50);
	      al2.add("Ashish");

	      //boolean addAll(java.util.Collection<?extends E>);
	      System.out.println("10.......boolean addAll(java.util.Collection<?extends E>)");
	      al.addAll(al2);
	      System.out.println(al);

              //boolean addAll (int ,java.util.Collection<? extends E>);
	      System.out.println("11......boolean addAll (int ,java.util.Colleaction<?extends E>)");
	      al.addAll(3 , al2);
	      System.out.println(al); 

	      //void removeRange(int ,int)
	      System.out.println("12........ void removeRange(int ,int)");
       	      al.removeRange(3 ,5);
	      
	      System.out.println(al);

	      //public java.lang.Object[] toArray()
	      System.out.println("13......toArray()");
	      Object arr[]=al.toArray();
	      System.out.println(arr);
	      for(Object data : arr){
	         System.out.println(data+" ");
	      }

	      //size
	      System.out.println("14........size()");
	      System.out.println(al.size());

	      //contains
	      System.out.println("15.........contains");
	      System.out.println(al.contains("Shashi"));
	      System.out.println(al.contains(30));
	      
	      }}
