class code2{
           static int mystrlen(String str){
	   char arr[]=str.toCharArray();
	   int count = 0;
	   for(int i =0 ; i<arr.length;i++){
	         count++;
	   }
	   
	   return count;
	   }
	   public static void main(String[]ars){
	       String str1 = "ShahsiBagal";
	       System.out.println(str1.length());
	       int len = mystrlen(str1);
	       System.out.println(len);

	   }
	   }
