import java.net.*;
import java.awt.*;
import java.io.*;
class code4{
             public static void main(String[]args) throws IOException , URISyntaxException{

	            URI obj=new URI ("www.youtube.com");

		    Desktop desk=Desktop.getDesktop();
		    desk.browse(obj);
	     }
}
