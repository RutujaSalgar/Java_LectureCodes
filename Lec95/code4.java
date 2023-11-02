import java.io.*;
class code4{
        public static void main(String[]args)throws IOException{
	     FileWriter fw=new FileWriter ("Incubator.txt");
	     fw.write("Flut\n");
	     fw.write("Front\n");
	     fw.write("Back\n");

	     fw.close();
	 //    fw.write("FrontEnd");
	}
}
