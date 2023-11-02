class code2{
           public static void main(String[]args){
	      String str1 = "Shashi";
	      String str2 = new String("Shashi");

	      System.out.println(System.identityHashCode(str1));
	      System.out.println(System.identityHashCode(str2));

		      if(str1.equals(str2)){
		            System.out.println("Equal");
		      }
		      else{
		           System.out.println("Not Equal");
		      }

	   }
}
