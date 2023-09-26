/*
 Que 30 : Alternate Positive and Negative number
Given an unsorted array Arr of N positive and negative numbers. Your task is to create an
array of alternate positive and negative numbers without changing the relative order of
positive and negative numbers.
Note: Array should start with a positive number and 0 (zero) should be considered a
positive element.
Example 1:
Input:
N = 9
Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
Output:
9 -2 4 -1 5 -5 0 -3 2
Explanation : Positive elements : 9,4,5,0,2
Negative elements : -2,-1,-5,-3
As we need to maintain the relative order of positive elements and negative
elements we will pick each element from the positive and negative and will store
them. If any of the positive and negative numbers are completed. we will continue
with the remaining signed elements.The output is 9,-2,4,-1,5,-5,0,-3,2.

Example 2:
Input:
N = 10
Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
Output:
5 -5 2 -2 4 -8 7 1 8 0
Explanation : Positive elements : 5,2,4,7,1,8,0
Negative elements : -5,-2,-8
As we need to maintain the relative order of positive elements and negative
elements we will pick each element from the positive and negative and will store
them. If any of the positive and negative numbers are completed. we will continue
with the remaining signed elements.The output is 5,-5,2,-2,4,-8,7,1,8,0.
*/
import java.util.*;
class Q30AlternativeNegativePost{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter arry : ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		boolean flag1=true;
		boolean flag2=false;
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			if(!(arr[i]>=0) && flag1){
				boolean flag3=false;
				for(int j=i;j<arr.length;j++){
					if(arr[j]>=0)
						flag3=true;
				}
				if(flag3){
					int temp1=0;
					for(int j=i;i<arr.length;j++){
						if(arr[j]>=0){
							int temp=arr[j];
							arr[j]=temp1;
							arr[i]=temp;
							break;
						}
						int temp=arr[j];
						arr[j]=temp1;
						temp1=temp;
					}
				}
			}
			if(!(arr[i]<0) && flag2){
				boolean flag4=false;
				for(int j=i;j<arr.length;j++){
                                        if(arr[j]<0)
                                                flag4=true;
                                }
                                if(flag4){
                                        int temp1=0;
                                        for(int j=i;i<arr.length;j++){
                                                if(arr[j]<0){
                                                        int temp=arr[j];
                                                        arr[j]=temp1;
                                                        arr[i]=temp;
                                                        break;
                                                }
                                                int temp=arr[j];
                                                arr[j]=temp1;
                                                temp1=temp;
                                        }
                                }
			}
			if(i%2==0){
				flag1=false;
				flag2=true;
			}
			else{
				flag1=true;
				flag2=false;
			}
			System.out.print(arr[i]+" ");
		}
	}
}
