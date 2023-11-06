/*
 Q5.
WAP to check whether a given string is a palindrome string or not.
*/
import java.util.Scanner;
class Q5PalindromeString{
	String palindromeStr(String str){
		if(str.length()<=0 || str==null)
			return "";
		return str.charAt(str.length()-1)+palindromeStr(str.substring(0,str.length()-1));
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter string: ");
                String str=sc.nextLine();
		if((new Q5PalindromeString().palindromeStr(str)).equals(str))
			System.out.println("palindrome string");
		else
			System.out.println("Not palindrome string");
	}
}
