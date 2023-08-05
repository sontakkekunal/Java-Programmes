//Q9
//write a program to print a series of strong numbers from entered range. ( Take a start and end number
//from a user )
//Input:-
//Enter starting number: 1
//Enter ending number: 150
//Output:-
//Output: strong numbers between 1 and 150
//1 2 145
import java.io.*;
//package myLogicalNum;
//public class Q9_StrongInRange{
class StrongInRange{
	boolean Strong(int num){
		int temp=num;
		int sum=0;
		while(temp!=0){
			int temp1=temp%10;
			int product=1;
			while(temp1!=0){
				product=product*temp1;
				temp1--;
			}
			sum=sum+product;
			temp=temp/10;
		}
		if(num==sum)
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
		StrongInRange obj = new StrongInRange();
		System.out.println("Strong numbers between "+start+" and "+end);
		for(int i=start;i<=end;i++){
			boolean value=obj.Strong(i);
			if(value)
				System.out.print(i+" ");
		}
	}
	
}
