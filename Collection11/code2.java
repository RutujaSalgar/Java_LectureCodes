interface  core2web{
           void lang();
}
class code2{
           public static void main(String[]args){
	           core2web c2w =new core2web(){
		     public void lang(){
		          System.out.println("Bootcamp/java/python/os");
		     }
		   };
		   c2w.lang();
	   } 
}
