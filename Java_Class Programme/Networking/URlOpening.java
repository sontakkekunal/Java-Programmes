import java.awt.*;
import java.net.*;
import java.io.*;
class OpenWebsite{
	public static void main(String [] args)throws IOException,URISyntaxException{
		String url="www.core2web.in";
		URI obj= new URI(url);

		Desktop desk=Desktop.getDesktop();
		desk.browse(obj);
	}
}
