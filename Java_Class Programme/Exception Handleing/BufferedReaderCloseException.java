import java.io.*;
class Input{
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data");
		String str= br.readLine();
		System.out.println(str);
		br.close();
		System.out.println("Enter data");
		String str2=br.readLine();
		System.out.println(str2);
	}
}
//O/p->
//Enter data
//45
//45
//Enter data
//Exception in thread "main" java.io.IOException: Stream closed
//	at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)  <--ensureOpen() checks that System.in pipline is connected with keyborad
//	                                                                              (time to time checking)
//	at java.base/java.io.BufferedReader.implReadLine(BufferedReader.java:363)
//	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:348)
//	at java.base/java.io.BufferedReader.readLine(BufferedReader.java:437)
//	at Input.main(BufferedReaderCloseException.java:10)

