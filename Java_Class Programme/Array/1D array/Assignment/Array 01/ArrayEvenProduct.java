//WAP to take size of array from user and also integer elements from user Print 
//product of even elements only
//input:Enter Size: 9
//Enter array elements: 1 2 3 2 5 10 55 77 99
//Output:40
import java.util.Scanner;
class ArrayOddProduct{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		int evenProduct=1;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==0);
			else if(arr[i]%2==0)
				evenProduct=evenProduct*arr[i];
		}
                System.out.println("Product of Even Elements : "+evenProduct);
	}
}

