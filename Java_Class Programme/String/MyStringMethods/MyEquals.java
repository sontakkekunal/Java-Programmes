import java.util.Scanner;
//package myStringMethods;
class MyEquals{
	static boolean equals1(String str1,String str2){
		if(str1.hashCode()==str2.hashCode())
			return true;
		else
			return false;
	}
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string : ");
		String str1=sc.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2=sc.nextLine();
		System.out.println("Str1 and str2 are same:  "+equals1(str1,str2));
	}
	
}
