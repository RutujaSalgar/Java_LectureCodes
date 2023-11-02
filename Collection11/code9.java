//Lambda function with multiple parameter
interface core2web{
         String lang(String comoany1 , String company2);
}
class code9{
               public static void main(String[]args){
	          core2web c2w=(name1 ,name2) -> {
		         return name1+"&"+name2+" By shashi" ;
		  };
		  System.out.println(c2w.lang("Biencaps" , "Incubator"));
	       }
}
