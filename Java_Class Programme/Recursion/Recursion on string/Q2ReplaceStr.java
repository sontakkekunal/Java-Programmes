/*
 Q2.
WAP to replace 'a' in a string with '1'
*/
import java.util.Scanner;
class Q2ReplaceStr{
	String replaceStr(String str,char ch){
		if(str.length()<=0 || str==null)
			return "";
		if(str.charAt(0)==ch)
			str="1"+str.substring(1);
		return str.charAt(0)+replaceStr(str.substring(1),ch);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter string: ");
                String str=sc.nextLine();
		System.out.println("Enter character: ");
		char ch=sc.nextLine().charAt(0);
		System.out.println("When we replace "+ch+" with 1 ,the string becomes "+new Q2ReplaceStr().replaceStr(str,ch));
	}
}
