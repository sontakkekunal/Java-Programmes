//WAP to take size of the array from user and also take integer element from user
//find the maximum element from the array
//Input:Enter size:5
//Enter array elements: 1 2 5 0 4
//Output:Max element:= 5
import java.util.Scanner;
class ArrayMax{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
                for(int i=0;i<arr.length;i++){
                        for(int j=i+1;j<arr.length;j++){
				int temp;
                                if(arr[i]<arr[j]){
                                        temp=arr[i];
                                        arr[i]=arr[j];
                                        arr[j]=temp;
				}
			}
		}
		System.out.println("Maxmum element in array is "+arr[0]);
	}
}
