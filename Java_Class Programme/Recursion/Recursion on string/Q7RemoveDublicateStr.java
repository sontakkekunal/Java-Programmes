/*
 Q7.
WAP to print the result of removing duplicates from a given string.
Input: Str = HappyNewYear
Output: HapyNewYr
*/
import java.util.Scanner;
class Q7RemoveDuplicate{
	String removeDublicate(String str,String ans){
		if(str.length()<=0 || str==null)
			return ans;
		if(!(ans.contains(str.charAt(0)+""))){
			//System.out.println("a");
			ans=ans+str.charAt(0);
		}
		return removeDublicate(str.substring(1),ans);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter 1st string: ");
                String str1=sc.nextLine();
		System.out.println("Output: "+new Q7RemoveDuplicate().removeDublicate(str1,""));
	}
}
