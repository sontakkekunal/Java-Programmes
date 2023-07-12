//Q3
//Write a program to take a range as input from the user and print perfect squares between that range.
//Input: Enter start: 1
//Enter end: 100
//Output: perfect squares between 1 and 100
import java.io.*;
class PerfectSqareInRangeQ3{
	public static void main(String[] args )throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end=Integer.parseInt(br.readLine());
		System.out.print("Perfect square between "+start+" and "+end+" : ");
		for(int i=start;i*i<=end;i++){
			System.out.print((i*i)+" ");
		}
	}
}



