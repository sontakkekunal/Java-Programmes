//Q6
//Write a program to take 5 numbers as input from the user and print the count of digits in those
//numbers.
//Input: Enter 5 numbers :
//5
//The digit count in 5 is 1
//25
//The digit count in 25 is 2
//225
//The digit count in 225 is 3
//6548
//The digit count in 6548 is 4
//852347
//The digit count in 852347 is 6
import java.io.*;
class DigitCountInRange{
	static int DigitCount(int num){
		int count=0;
		while(num!=0){
			count++;
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args )throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter "+(i+1)+" number : ");
			arr[i]=Integer.parseInt(br.readLine());
			System.out.println("\nThe Digit count in "+arr[i]+" is "+DigitCount(arr[i]));
		}
	}
}

