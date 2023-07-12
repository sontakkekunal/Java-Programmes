import java.util.Scanner;
class ArraySum{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int arry[]= new int[5];
		System.out.println("Enter number in array");
		int sum=0;
		for(int i=0;i<5;i++){
			arry[i]=sc.nextInt();
			sum=sum+arry[i];
		}
		System.out.println("Sum of array is "+sum);
	}
}


