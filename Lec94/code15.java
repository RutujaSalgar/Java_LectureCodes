import java.io.*;
class code15{
           public static void main(String[]args){
		   int count=0;
	   File fobj=new File("/home/rutuja/java/Lecture_codes/FileHandLing");
	   System.out.println(fobj.exists());

	   String[]files=fobj.list();
	   for(String str:files){
		   File f=new File(str);
		   if(f.isDirectory())
	            count++;
	   }
	   System.out.println(count);
	   }
}
