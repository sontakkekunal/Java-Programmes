//Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
//count of even numbers.
//Input: Enter a lower limit: 1
//Enter upper limit: 50
//Output: 10, 20, 30, 40, 50
//Count = 5
import java.io.*;
class DivisibleEvenInRange{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a lower limit : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enetr upper limit : ");
		int end=Integer.parseInt(br.readLine());
		System.out.println("Enter a number to divide ");
		int div=Integer.parseInt(br.readLine());
		System.out.print("The Even number divisible by "+div+" between range "+start+" and "+end+" is : ");
		for(int i=start;i<=end;i++){
			if(i%2==0 && i%div==0)
				System.out.print(i+" , ");
		}
	}
}
