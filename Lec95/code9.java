import java.io.*;
class code9{
           public static void main(String[]args) throws IOException{
	   FileOutputStream fr=new FileOutputStream("Incubator.txt");

	   System.out.println(fr.getFD());
	   /*
	   int data =fr.read();
	   while(data!=-1){
	         System.out.print((char)data);
		 data=fr.read();
	   }
	   fr.close();*/
	   }
}
