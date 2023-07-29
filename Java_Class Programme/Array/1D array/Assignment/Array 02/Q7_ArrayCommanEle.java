//WAP to find the comman element  between two arrays
//Input:
//Enter first array: 1 2 3 5
//Enter Second array: 2 1 9 8
//output: common elements:
//1
//2
import java.util.Scanner;
class ArrayCommanEle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array : ");
		int size1 = sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter element in first array ");
		for(int i=0;i<size1;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array : ");
                int size2 = sc.nextInt();
                int arr2[]=new int[size2];
                System.out.println("Enter element in second array ");
                for(int i=0;i<size2;i++){
                        arr2[i]=sc.nextInt();
                }
		System.out.println("Common elements: ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}
}




