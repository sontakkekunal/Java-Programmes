//WAP to print elemnts whose addition of digits is even
//Ex.=2+6=8(8 is even so print 26)
//Input:
//Enter array: 1 2 35 15 16 14 28 17 29 123
//Output:2 15 28 17 123
import java.util.Scanner;
class ArrayDigitAddEven{
	int check(int num){
		int sum=0;
		while(num!=0){
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Output: ");
		for(int i=0;i<size;i++){
			ArrayDigitAddEven obj = new ArrayDigitAddEven();
			int value;
			value=obj.check(arr[i]);
			if(value%2==0)
				System.out.print(arr[i]+" ");
			else
				continue;
		}
		System.out.println();
	}
}

			
