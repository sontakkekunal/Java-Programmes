//WAP to take size of array from user and also integer elements from user Print
//product of odd index only
//Input:Enter size:6
//Enter array elements: 1 2 3 4 5 6
//Output: 48
//2*4*6
import java.util.Scanner;
class ArrayOddIProd{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		int oddIProd=1;
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(i==0)
				continue;
			else if(i%2==1)
				oddIProd=oddIProd*arr[i];
		}
		System.out.println("Output:  "+oddIProd);
	}
}
