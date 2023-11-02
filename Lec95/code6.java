import java.io.*;
class code6{
            public static void main(String[]args)throws IOException{
	         File f=new File("Incubator.txt");
		 FileWriter fw=new FileWriter(f);
		 fw.write("Test");
		 fw.write("Design");
		 fw.write("sales");
		 fw.close();
	    }
}
