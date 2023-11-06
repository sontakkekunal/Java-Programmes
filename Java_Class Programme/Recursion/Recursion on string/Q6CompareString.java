/*
 Q6.
Compare two strings, if the same return true else false.
*/
import java.util.Scanner;
class Q6CompareString{
	boolean compareStr(String str1,String str2){
		if(str1.length()!=str2.length())
			return false;
		if(str1.length()<=0 || str1==null)
			return true;
		if(str1.charAt(0)!=str2.charAt(0))
			return false;
		return compareStr(str1.substring(1),str2.substring(1));
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter 1st string: ");
                String str1=sc.nextLine();
		System.out.println("Enter 2nd string: ");
		String str2=sc.nextLine();
		System.out.println("String 1 and string 2 are same: "+ new Q6CompareString().compareStr(str1,str2));
	}
}
