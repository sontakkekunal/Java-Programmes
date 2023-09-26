/*
 19] Find common elements in three sorted arrays

Given three Sorted arrays in non-decreasing order, print all common elements in
these arrays.
Examples:
Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
Input:
ar1[] = {1, 5, 5}
ar2[] = {3, 4, 5, 5, 10}
ar3[] = {5, 5, 10, 20}
Output: 5, 5
*/
import java.util.*;
class Q19CommanEleInThreeArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
		System.out.println("Enter Second Array size: ");
                int size1=sc.nextInt();
		System.out.println("Enter third  Array size: ");
                int size2=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter second Array: ");
                int arr1[] = new int[size1];
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
		System.out.println("Enter third Array: ");
                int arr2[] = new int[size2];
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=sc.nextInt();
                }
		System.out.println("Comman element in Three array are: ");
		/*
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				for(int k=0;k<arr2.length;k++){
					if(arr[i]==arr1[j] && arr1[j]==arr2[k] && arr2[k]==arr[i])
						System.out.print(arr[i]+" , ");
				}
			}
		}
		*/
		for(int i=0;i<arr.length;i++){
			boolean check1=false;
			boolean check2=false;
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j])
					check1=true;
			}
			for(int k=0;k<arr2.length;k++){
				if(arr[i]==arr2[k])
					check2=true;
			}
			if(check1 && check2){
				System.out.print(arr[i]+" , ");
			}
		}
	}
}
