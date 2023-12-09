import java.util.Scanner;
class RevursionStr{
	String stringReverse(String str){
		if(str.length()<=0)
			return "";
		return str.charAt(str.length()-1)+stringReverse(str.substring(0,str.length()-1));
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		System.out.println("Reversed string is: "+new RevursionStr().stringReverse(str));
	}
}
