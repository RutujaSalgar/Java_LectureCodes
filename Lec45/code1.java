class code1{
           public static void main(String[]args){
	      StringBuffer sb = new StringBuffer();

	      System.out.println(sb.capacity());
	      System.out.println(sb);

	      sb.append("Shashi");
	      System.out.println(sb.capacity());
	      System.out.println(sb);

	      System.out.println("Bagal");
	      System.out.println(sb.capacity());
	      System.out.println(sb);

	      sb.append("Core2web");
	      System.out.println(sb.capacity());
	      System.out.println(sb);
	   }
}
