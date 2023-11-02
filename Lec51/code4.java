class Employee{
       int empID = 10;
       String name = "Kanha";

       void empInfo(){
             System.out.println("ID = " + empID);
	     System.out.println("Name = " + name);
       }
}
class code4{
         public static void main(String[]arrgs){
	          Employee emp1 = new Employee();
		  Employee emp2 = new Employee();

		  emp1.empInfo();
		  emp2.empInfo();

		  emp2.empID = 20;
		  emp2.name = "Rahim" ;

		  emp1.empInfo();
		  emp2.empInfo();
	 }
}
