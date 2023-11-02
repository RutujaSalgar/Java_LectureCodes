import java.io.*;
class code3{
        public static void main(String[]args)throws IOException{
	     FileWriter fw=new FileWriter ("Incubator.txt");
	     fw.write("Flutter\n");
	     fw.write("FrontEnd\n");
	     fw.write("Backend\n");

	     fw.close();
	 //    fw.write("FrontEnd");
	}
}
