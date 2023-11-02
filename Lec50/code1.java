class core2web{
          int numCourse = 8;
	  private String favCourse= "CPP";

	  void disp(){
	     System.out.println(numCourse);
	     System.out.println(favCourse);
	  }
}
class code1{
        public static void main(String[]ars){
	    core2web obj = new core2web();
	    obj.disp();
	    System.out.println(obj.numCourse);
	    System.out.println(obj.favCourse);
	}
}
