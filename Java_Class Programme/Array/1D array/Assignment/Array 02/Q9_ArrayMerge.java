//WAP to merge two given arrays
//array1={10,20,30,40,50}
//array2={9,18,27,36,45}
//Output:
//Merged Array={10,20,30,40,50,9,18,27,36,45}

import java.util.Scanner;
class ArrayMerge{
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
		int arr3[]=new int[size1+size2];
		for(int i=0;i<size1;i++){
			arr3[i]=arr1[i];
		}
		int j=0;
		for(int i=size1;i<arr3.length;i++){
			arr3[i]=arr2[j];
			j++;
		}
		System.out.print("Merged array= ");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}
