//Q5
//Write a program to take range as input from the user and print perfect numbers.
//{Note: Perfect number is the one whose perfect divisor’s addition is equal to that number.
//Ex:--6 is perfect number = 1 + 2 + 3 = 6}
//Input: Enter start: 1
//Enter end: 30
//Output: perfect numbers between 1 and 30
//6 28
import java.io.*;
//package myLogicalNum;
class PerfectNumInRange{
//class Q5_PerfectNumInRangeQ5{
	static boolean Perfect(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
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
		System.out.println("Perfect number between "+start+" and "+end+" : ");
		for(int i=start;i<=end;i++){
			boolean value=Perfect(i);
			if(value)
				System.out.print(i+" ");
		}
	}
	
}
