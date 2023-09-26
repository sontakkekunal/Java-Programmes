/*
 5] Replace all 0's with 5

You are given an integer N. You need to convert all zeros of N to 5.
Example 1:
Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004
on replacing all zeroes with "5", the new
number will be "1554".
Example 2:
Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in
"121", the number remains as "121".
*/
import java.io.*;
class Q3All0to5{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number: ");
		int num=Integer.parseInt(br.readLine());
		int temp1=num;
		int value=0;
		while(temp1!=0){
			if(temp1%10==0){
				value=value*10+5;
			}
			else{
				value=value*10+(temp1%10);
			}

      			temp1=temp1/10;
		}
		int temp2=value;
		value=0;
		while(temp2!=0){
			value=value*10+(temp2%10);
			temp2=temp2/10;
		}
		System.out.println("Output after reaplacing 0 to 5  is : "+value);
	}
}
