import java.util.*;
import java.util.concurrent.*;
class Employee{
          String name;
	  Employee(String name){
	        this.name=name;
	  }
	  public String toString(){
	    return name;
	  }
}
class sortByName implements Comparator{
          public int compare(Object obj1 ,Object obj2){
	            return ((Employee)obj1).name.compareTo(((Employee)obj2).name);

	  }}
class code14{
          public static void main(String []args)throws InterruptedException{
		  BlockingQueue bqueue =new PriorityBlockingQueue(3,new sortByName());

		  bqueue.put(new Employee("Kanha"));
		  bqueue.put(new Employee("Ashish"));
		  bqueue.put(new Employee("Rahul"));
		  
		  System.out.println(bqueue);

		  bqueue.offer(new Employee("Badhde"),5,TimeUnit.SECONDS);
		  System.out.println(bqueue);
	  
	  }}
