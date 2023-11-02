import java.io.*;
class code7{
            public static void main(String[]args)throws IOException{
	         File f=new File("Incubator.txt");
		 FileWriter fw=new FileWriter(f);
		 fw.write("Test\n");
		 fw.write("Design\n");
		 fw.write("sales\n");
		 fw.close();
	    }
}
