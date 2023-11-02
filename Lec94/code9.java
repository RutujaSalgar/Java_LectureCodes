import java.io.*;
class code9{
            public static void main(String[]args)throws IOException{
	      File fobj=new File("FileHandLing");
	      fobj.mkdir();

	      File fobj1=new File(fobj,"code1.txt");
	      fobj1.createNewFile();
	    }
}
