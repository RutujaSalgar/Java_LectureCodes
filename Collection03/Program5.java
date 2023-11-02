import java.util.*;
class ITCompany{
	              String companyName=null;
		      int empCount=0
			      ;
            ITCompany(String companyName ,int empCount){
	          this.companyName=companyName;
	          this.empCount=empCount;
	    }
}
class Program5{
              public static void main(String[]args){
	       ArrayList obj=new ArrayList();
	       obj.add(10);
	       obj.add(10.5);
	      obj.add("Core2web");
	      obj.add(new ITCompany ("Biencaps" ,20));
	      System.out.println(obj);
	      }
}
