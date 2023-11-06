/*
 Q8.
WAP to divide a string into n equal parts. Where string length is multiple of n.
Example:
str = "aaaabbbbcccc";
n = 3
Output:

aaaa
bbbb
cccc
*/
import java.util.Scanner;
class Q8DivideStrInParts{
	void divdeStrInPart(String str,int n){
		if(str.length()<=0 || str==null)
			return;
		int start=0;
		int end=str.length()/n;
		System.out.println(str.substring(start,end));
		divdeStrInPart(str.substring(end),n-1);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter 1st string: ");
                String str1=sc.nextLine();
		System.out.println("Enter n for dividing string: ");
		int n=sc.nextInt();
		new Q8DivideStrInParts().divdeStrInPart(str1,n);
	}
}
