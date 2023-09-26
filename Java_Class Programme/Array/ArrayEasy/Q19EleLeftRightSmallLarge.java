/*
 Que 19 : Elements with left side smaller and right side greater
Given an unsorted array of size N. Find the first element in the array such that all of its
left elements are smaller and all right elements to it are greater than it.
Note: Left and right side elements can be equal to required elements. And extreme
elements cannot be required.

Example 1:
Input:
N = 4
A[] = {4, 2, 5, 7}
Output:
5
Explanation:
Elements on the left of 5 are smaller than 5 and on the right of it are greater than 5.

Example 2:
Input:
N = 3
A[] = {11, 9, 12}
Output:
-1
*/
import java.util.Scanner;
class Q19EleLeftRightSmallLarge{
	int leftRight(int [] arr){
		int val=-1;
		for(int i=0;i<arr.length;i++){
                        boolean flag1=true;
                        boolean flag2=true;
                        for(int j=0;j<i;j++){
                                if(!(arr[j]<arr[i])){
                                        flag1=false;
                                        break;
                                }
                        }
			if(i==0)
				flag1=false;
                        for(int k=i+1;k<arr.length;k++){
                                if(!(arr[k]>arr[i])){
                                        flag2=false;
                                        break;
                                }
                        }
			if(i==arr.length-1)
				flag2=false;
                        if(flag1 && flag2)
                                val=arr[i];
                }
		return val;
	}
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[]=new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Output: ");
		Q19EleLeftRightSmallLarge obj = new Q19EleLeftRightSmallLarge();
		System.out.println(obj.leftRight(arr));
	}
}

