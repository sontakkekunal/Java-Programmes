import java.io.*;
import java.util.StringTokenizer;
class StringTokenCount{
	public static void main(String [] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Player info. ");
		String str=br.readLine();
		StringTokenizer tok = new StringTokenizer(str," ");
		System.out.println("number of tokens  in player info is "+ tok.countTokens());
		int n=1;
		while(tok.hasMoreTokens()){
		System.out.println(n+" token is "+tok.nextToken());
		n++;
		}
	}
}


