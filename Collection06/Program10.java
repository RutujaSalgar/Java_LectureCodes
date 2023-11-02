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
class Program10{
            public static void main(String[]args){
	    ArrayList al= new ArrayList();
	    al.add(new Employee("Kanha"  ,200000.0f));
	    al.add(new Employee("Ashish " ,2500000.0f));
	    al.add(new Employee("Badhe" ,150000.0f));
	    al.add(new Employee("Rahul" , 1750000.0f));

	    System.out.println(al);
	    
	    Collections.sort(al);
	    System.out.println(al);
	    }}
