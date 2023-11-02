class Employee{
          int empID = 10;
	  String str = "Kanha";

	  void empInfo(){
	     System.out.println("ID = " + empID);
	     System.out.println("Name = " + str);
	  }
}
class code3{
     public static void main(String[]args){
               Employee emp1 = new Employee();
	       Employee emp2 = new Employee();

	       emp1.empInfo();
	       emp2.empInfo();
     }
}
