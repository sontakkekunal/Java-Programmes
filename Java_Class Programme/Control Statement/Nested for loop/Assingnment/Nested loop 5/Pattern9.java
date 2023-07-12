//WAP to take a number as input and print the addition of factorial of each
//digit from number
//Input: 1234
//Outpur: Addition of factorial of each digit from 1234=33
import java.io.*;
class Pattern9{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter number ");
		int num=Integer.parseInt(br.readLine());
		int temp1=num;
		int sum=0;
		while(temp1!=0){
			int temp2=temp1%10;
			int product=1;
			while(temp2!=0){
				product=product*temp2;
				temp2--;
			}
			sum=sum+product;
			temp1=temp1/10;
		}
		System.out.println("Addition of factorial of each digit from "+num+" = "+sum);
	}
}

