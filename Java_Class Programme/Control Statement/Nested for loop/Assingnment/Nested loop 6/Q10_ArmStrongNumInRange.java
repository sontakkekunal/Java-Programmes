//Q10
//Write a program to take range as input from the user and print Armstrong numbers. ( Take a start and
//end number from a user )
//Input: Enter start: 1
//Enter end: 1650
//Output: Armstrong numbers between 1 and 1650
//1 2 3 4 5 6 7 8 9 153 370 371 407 1634
import java.io.*;
//package myLogicalNum;
//public class Q10_ArmStrongNumInRange{
class ArmStrongNumInRange{
	boolean ArmStrong(int num){
		int temp1=num;
		int temp2=num;
		int count=0;
		while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		int sum=0;
		while(temp2!=0){
			int product=1;
			for(int i=1;i<=count;i++){
				product=product*(temp2%10);
			}
			sum=sum+product;
			temp2=temp2/10;
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
		ArmStrongNumInRange obj =new ArmStrongNumInRange();
		System.out.println("ArmStrong number between "+start+" and "+end);
		for(int i=start;i<=end;i++){
			boolean value=obj.ArmStrong(i);
			if(value)
				System.out.print(i+" ");
		}
	}
	
}

