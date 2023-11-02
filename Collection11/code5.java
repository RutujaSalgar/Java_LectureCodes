
interface core2web{
            String lang();

}
class code5{
           public static void main(String[]args){
	       core2web c2w = () ->{
	             return "Bootcamp/Java/Python/OS";
	       };
	       System.out.println(c2w.lang());
	   }
}
