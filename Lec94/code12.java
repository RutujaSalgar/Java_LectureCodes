import java.io.*;
class code12{
           public static void main(String[]args){
	   File fobj=new File("/home/rutuja/java/Lecture_codes/FileHandLing");
	   System.out.println(fobj.exists());

	   String [] files=fobj.list();
	   for(String str:files){
	         System.out.println(str);
	   }
	   }
}
