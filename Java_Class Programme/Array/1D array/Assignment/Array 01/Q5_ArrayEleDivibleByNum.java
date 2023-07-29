//WAP , to take 10 input from the user and print only element that are divisible by 5
//Input: 10 2 2 3 3 3 4 4 25 55
//Output:10 25 55
import java.util.Scanner;
class ArrayEleDivisibleByNum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter number for dividing array ");
                int div=sc.nextInt();
		System.out.print("Output: ");
		for(int i=0;i<size;i++){
			if(arr[i]%div==0)
				System.out.print(arr[i]+" ");
		}
	}
}

