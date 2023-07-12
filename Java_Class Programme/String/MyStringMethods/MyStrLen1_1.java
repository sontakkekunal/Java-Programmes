import java.util.Scanner;
class MyLenStr1_1{
	static int myLenStr(String str){
		char ch[]=str.toCharArray();
		return ch.length;
	}
	public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string for finding length : ");
        String str=sc.nextLine();
        int len=myLenStr(str);
        System.out.println("Length of string is : "+len);
	}
}
