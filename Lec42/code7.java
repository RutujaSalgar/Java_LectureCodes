class code7{
           public static void main(String[]args){
	      String str1 = "Shashi";
	      String str2 = "Bagal" ;

	      System.out.println(str1+str2);

	     String str3 = "ShashiBagal";
	     String str5 = str1.concat(str2);
	     String str4 = str1+str2;
	     System.out.println(System.identityHashCode(str3));
	     System.out.println(System.identityHashCode(str4));
	   }
}
