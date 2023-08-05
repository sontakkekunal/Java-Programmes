//Q8
//Write a program to take range as input from the user and print Palindrome numbers. ( Take a start and
//end number from a user )
//Input: Enter start: 100
//Enter end: 250
//Output: Palindrome numbers between 100 and 250
//101 111 121 131 141 151 161 171 181 191 202 212 222
import java.io.*;
//package myLogicalNum;
//public class Q8_PalindromeInRange{
class PalindromeInRange{
	boolean Palindrome(int num){
		int temp=num;
		int value=0;
		while(temp!=0){
			value=value*10+(temp%10);
			temp=temp/10;
		}
		if(value==num)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args )throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end=Integer.parseInt(br.readLine());
		PalindromeInRange obj= new PalindromeInRange();
		System.out.println("Palindrome number between "+start+" and "+end);
		for(int i=start;i<=end;i++){
			boolean value=obj.Palindrome(i);
			if(value)
				System.out.print(i+" ");
		}
	}
	
}
