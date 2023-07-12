//Write a program to print the product of the first N numbers
import java.util.Scanner;
class ProductOfFirstN{
	public static void main(String [] atgs){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  number for product  till that number  ");
		int N=input.nextInt();
		int product=1;
		if(N>0){
//			for(int i=N;i>0;i--){
			for(int i=1;i<=N;i++){
				product=product*i;
			}
			System.out.println("Product of number till "+N+" is "+product);
		}
		else if(N<0){
//			for(int i=N;i<0;i++){
			for(int i=-1;i>=N;i--){
				product=product*i;
			}
			System.out.println("Product of number till "+N+" is "+product);
		}
		else
			System.out.println("Mutilication of zero with other is  0");
	}
}

