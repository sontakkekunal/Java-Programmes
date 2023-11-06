/*
 Q1.
WAP to count the vowels in string.
*/
import java.util.Scanner;
class Q1VowelInStringCount{
	int vowelCountInStr(String str){
		if(str.length()<=0 || str==null)
			return 0;
		int count=0;
		if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i'  || str.charAt(0)=='o' || str.charAt(0)=='u' || str.charAt(0)=='A' || str.charAt(0)=='E' || str.charAt(0)=='I'  || str.charAt(0)=='O' || str.charAt(0)=='U')
			count++;
		return count+ vowelCountInStr(str.substring(1));
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		System.out.println("Number of vowels in string are: "+new Q1VowelInStringCount().vowelCountInStr(str));
	}
}
