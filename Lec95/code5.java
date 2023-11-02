import java.io.*;
class code5{
        public static void main(String[]args)throws IOException{
	     FileWriter fw=new FileWriter ("Incubator.txt", true );
	     fw.write("Test");
	     fw.write("Design");
	     fw.write("sales");

	     fw.close();
	    
	}
}
