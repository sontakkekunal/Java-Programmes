//WAP to search a specfic element from an array and return its index
//Input: 1 2 4 5 6
//Enter element to search: 4
//Output:element found at index: 2
import java.util.Scanner;
class ArraySearch{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elemnt to search ");
		int key=sc.nextInt();
		for(int i=0;i<size;i++){
			if(key==arr[i])
				System.out.println("Element found at index "+i);
		}
	}
}

