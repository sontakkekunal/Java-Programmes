/*
 Q9.
Given two strings str1 and str2 , return true if str2 is an anagram of str1 , and false
otherwise.
Input: str1 = “listen” str2 = “silent”
Output: true
*/
import java.util.Scanner;
class Q9AnagramStr{
	int i=0;
	int strCount(char ch,String str){
		if(str.length()<=0 || str==null)
			return 0;
		int count=0;
		if(ch==str.charAt(0))
			count++;
		return count+strCount(ch,str.substring(1));
	}
	boolean anagramStr(String str1, String str2){
		if( str1.length()!=str2.length())
			return false;
		if(i>=str1.length())
			return true;
		if(strCount(str1.charAt(i),str1)!=strCount(str1.charAt(i),str2))
			return false;
		i++;
		return anagramStr(str1,str2);

	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter 1st string: ");
                String str1=sc.nextLine();
		System.out.println("Enter 2st string: ");
                String str2=sc.nextLine();
		System.out.println("Angram string: "+new Q9AnagramStr().anagramStr(str1,str2));
	}
}
