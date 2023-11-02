import java.io.*;
class code2{
        public static void main(String[]args)throws IOException{
	     FileWriter fw=new FileWriter ("Incubator.txt");
	     fw.write("Flutter");
	     fw.write("FrontEnd");
	     fw.write("Backend");

	     fw.close();
	     fw.write("FrontEnd");
	}
}
