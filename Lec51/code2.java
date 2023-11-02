class Employee{
          int id = 10;
	  String str = "Kanha";

	  void empInfo(){
	      System.out.println("ID"+ id);
	      System.out.println("Name"+ str);
	  }
}
class code2{
         public static void main(String[]args){
	       Employee emp1 = new Employee();
	       emp1.empInfo();

	       System.out.println(emp1.id);
	       System.out.println(emp1.str);
	 }
}
