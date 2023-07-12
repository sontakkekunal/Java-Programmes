//Write a program to take range as input from the user and print the reverse of all numbers.
//( Take a start and end number from a user )
//Input: Enter start: 100
//Enter end: 200
import java.io.*;
class ReverseInRangeQ7{
	int Reverse(int num){
		int value=0;
		while(num!=0){
			value=value*10+(num%10);
			num=num/10;
		}
		return value;
	}
	public static void main(String[] args )throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start : ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter end : ");
		int end=Integer.parseInt(br.readLine());
		ReverseInRangeQ7 obj=new ReverseInRangeQ7();
		System.out.print("Reverse number in the range "+start+" and "+end+" is ");
		for(int i=start;i<=end;i++){
			int value=obj.Reverse(i)   ;
			System.out.print(value+" ");
		}
	}
}

