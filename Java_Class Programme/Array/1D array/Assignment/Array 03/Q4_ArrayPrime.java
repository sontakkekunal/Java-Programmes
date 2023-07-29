//Wap a find a Prime  number from an array and return its index.Take size and elemnt from the user
//Input: 10 25 36 566 34 53 50 100
//Output: prime no 53 found at index 5
import java.util.Scanner;
class ArrayPrime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
				if(count>2)
					break;
			}
			if(count==2)
				System.out.println("Prime number "+arr[i]+" found at index "+i);
		}
	}
}
