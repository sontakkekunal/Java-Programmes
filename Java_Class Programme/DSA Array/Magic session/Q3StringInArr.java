/*
 Problem 3:
Given a string s and an array of string words, determine whether s is a prefix string of words.
A string s is a prefix string of words if s can be made by concatenating the first k strings in words
for some positive k no larger than words.length.
Return true if s is a prefix string of words, or false otherwise.
Example 1:
Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.
Example 2:
Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.

Constraints:
1 <= words.length <= 100
1 <= words[i].length <= 20
1 <= s.length <= 1000
words[i] and s consist of only lowercase English letters.
*/
import java.util.*;
class StringMatch{
	static boolean prefixString(String[] str,String s){
		boolean flag=true;
		int a=0;
		for(int i=0;i<str.length;i++){
			if(a>=s.length())
				break;
			for(int j=0;j<str[i].length();j++){
				if(a>=s.length())
        	                        break;
				if(str[i].charAt(j)==s.charAt(a))
					flag=true;
				else{
					flag=false;
					break;
				}
				a++;
			}
			if(flag==false)
				break;
		}
		return flag;
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array length: ");
		int N=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter string array: ");
		String[] str= new String[N];
		for(int i=0;i<N;i++){
			str[i]=sc.nextLine();
			//System.out.println(str[i]);
		}
		System.out.println("Enter s: ");
		String s=sc.nextLine();
		System.out.println("Output: "+prefixString(str,s));
	}
}
