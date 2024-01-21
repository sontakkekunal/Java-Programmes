/*
Problem Statement 8:
Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n))
time complexity and with the smallest space complexity possible.

Example 1:
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not
changed (for example, 2 and 3), while the positions of other numbers are changed
(for example, 1 and 5).
Example 2:
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.

Constraints:
1 <= nums.length <= 5 * 10^4
-5 * 104 <= nums[i] <= 5 * 10^4
*/
import java.util.Scanner;
class Q8SortingNonSortedNumInArr{
	int partition(int arr[],int start,int end){
		int i=start-1;
		int element=arr[end];
		for(int j=start;j<end;j++){
			if(arr[j]<element){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=element;
		arr[end]=temp;
		return i+1;

	}
	void quickSort(int arr[],int start,int end){
		if(start<end){
			int pivote=partition(arr,start,end);
			quickSort(arr,start,pivote-1);
			quickSort(arr,pivote+1,end);
		}
	}

	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[]= new int[size];
		int sortStart=0;
		int endEnd=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int tempStart=0;
		int length=0;
		int maxlength=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++){
			//System.out.println("jj");
			if(arr[i]<=arr[i+1]){
				if(tempStart==0)
					tempStart=i;
	//			System.out.println("here1 "+i); 
			}
			else if(tempStart!=0){
				length=i-tempStart;
	//			System.out.println("here2 "+i);
				if(length>maxlength){
				//	System.out.println("here3 "+i);
					maxlength=length;
					sortStart =tempStart;
					endEnd=i;
				}
				tempStart=0;
			}
		}
	//	System.out.println("start: "+sortStart);
	//	System.out.println("end: "+endEnd);
		int tempArr[]= new int[arr.length-(maxlength+1)];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(i<sortStart || i>endEnd){
				tempArr[j]=arr[i];
				j++;
			}
			if(i==sortStart)
				i=endEnd;
		}
		new Q8SortingNonSortedNumInArr().quickSort(tempArr,0,tempArr.length-1);
		int x=0;
		int y=0;
		int m=0;
		int newArr[]= new int[maxlength+1];
		int a=sortStart;
		int b=0;
		while(a<=endEnd){
			newArr[b]=arr[a];
			a++;
			b++;
		}
		int temp[]=arr;
		arr=newArr;
		newArr=temp;
		while(y<tempArr.length && x<arr.length){
			if(tempArr[y]<arr[x]){
				newArr[m]=tempArr[y];
				y++;
			}
			else{
				newArr[m]=arr[x];
				x++;
			}
			m++;
		//	System.out.println("x: "+x+"y: "+y+"m: "+m);
		}
		//System.out.println("here");

		while(y<tempArr.length){
			newArr[m]=tempArr[y];
			y++;
			m++;
		}
		while(x<arr.length){
			newArr[m]=arr[x];
			x++;
			m++;
		}
		arr=newArr;
		System.out.println("Output: ");
		for(int z=0;z<arr.length;z++){
			System.out.print(arr[z]+"  ");
		}

	}
}
