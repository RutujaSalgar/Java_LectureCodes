import java.util.*;
class Employee{
           String empName=null;
           float sal=0.0f;
	   Employee(String empName,float sal){
	   this.empName=empName;
	   this.sal=sal;   
	   
	   }
	   public String toString(){
	    return "{" +empName+":"+sal+ "}" ;
	   }
}
class sortByName implements Comparator <Employee>{
           public int compare(Employee obj1,Employee obj2){
	        return obj1.empName.compareTo(obj2.empName);  
	   } 
}
class sortBySal implements Comparator <Employee>{
           public int compare(Employee obj1 , Employee obj2){
	          return (int)(obj1.sal - obj2.sal);
	   } 
}
class Program12{
            public static void main(String[]args){
	    ArrayList<Employee> al= new ArrayList<Employee>();
	    al.add(new Employee("Kanha"  ,200000.0f));
	    al.add(new Employee("Ashish " ,2500000.0f));
	    al.add(new Employee("Badhe" ,150000.0f));
	    al.add(new Employee("Rahul" , 1750000.0f));

	    System.out.println(al);
	    
	    Collections.sort(al,new sortByName());
	    System.out.println(al);

	    Collections.sort(al ,new sortBySal());
	    System.out.println(al);
	    }}
