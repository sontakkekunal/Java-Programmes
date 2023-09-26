//URL:-


//URL format:-
//https://www.youtube.com:80/home.html
//protocal  ServerName/   port  index.html
//           IPaddress    no.      /filename


import java.net.*;
class URLDemo{
	public static void main(String [] args)throws MalformedURLException{
		URL obj =new URL("https://core2web.in:20/home.html"); //URL constructor throws MalformedURLException because the passed 	                                                              // URL must be in URL format
		//URL obj =new URL("Kunal");
		System.out.println(obj.getProtocol());

		System.out.println(obj.getPort());  //if port is mentioned in the url , then it return -1

		System.out.println(obj.getFile());
	}
}
