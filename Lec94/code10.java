import java.io.*;
class code10{
              public static void main(String[]args)throws IOException{
	            File fobj=new File("Incubator1.txt");
		    fobj.createNewFile();
		    System.out.println(fobj.getName());

		    System.out.println(fobj.getParent());

		    System.out.println(fobj.getPath());

		    System.out.println(fobj.getAbsolutePath());

		    System.out.println(fobj.canRead());

		    System.out.println(fobj.canWrite());

		    System.out.println(fobj.isDirectory());

		    System.out.println(fobj.isFile());
	      }
}
