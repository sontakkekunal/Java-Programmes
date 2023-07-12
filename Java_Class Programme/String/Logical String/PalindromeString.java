import java.io.*;
class PalindromeString{
	static boolean checkPalindromeString(String str1){
		String str2="";
		for(int i=str1.length()-1;i>=0;i--){
			str2=str2+str1.charAt(i);
		}
		if(str2.equals(str1))
			return true;
		else
			return false;
	}
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String for checking it is palindrome or not: ");
		String str=br.readLine();
		boolean boolValue=checkPalindromeString(str) ;
		if(boolValue)
			System.out.println(str+" is palindrome String ");
		else
			System.out.println(str+" is not palindrome string ");
	}
}
