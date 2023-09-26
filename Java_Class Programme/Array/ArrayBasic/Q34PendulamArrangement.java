/*
 34] Print an array in Pendulum Arrangement

Given an array arr of size n. Arrange the elements of the array in a way similar to
the to-and-fro movement of a Pendulum.
The minimum element out of the list of integers, must come in the center position
of the array. If there are even elements, then minimum element should be moved to
(n-1)/2 index (considering that indexes start from 0)
The next number (next to minimum) in the ascending order, goes to the right, the
next to next number goes to the left of the minimum number and it continues like a
Pendulum.
As higher numbers are reached, one goes to one side in a to-and-fro manner similar
to that of a Pendulum

Example 1:
Input :
n = 5
arr[] = {1, 3, 2, 5, 4}
Output :
5 3 1 2 4
Explanation:
The minimum element is 1, so it is moved to the middle. The next higher
element 2 is moved to the right of the middle element while the next higher
element 3 is moved to the left of the middle element and this process is
continued.
Example 2:
Input :
n = 5
arr[] = {11, 12, 31, 14, 5}
Output :
31 12 5 11 14
*/
import java.util.*;
class Q34PendulamArragemnet{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
		int min=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(i==0)
				min=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		//System.out.println("A "+min);
		int data=min-1;
		boolean flag=true;
		int m=1;
		int k=-1;
		for(int i=0;i<arr.length;i++){
			int n=0;
			for(int j=0;j<arr.length;j++){
				if(j==0)
					min=arr[j];
				if(min>arr[j] && arr[j]>data){
					min=arr[j];
					n=j;
				}
			}
			//System.out.println(min +"  "+data);
			if(i==0){
				int temp=arr[(int)(size/2)];
				arr[(int)(size/2)]=min;
				arr[n]=temp;
				data=min;
				continue;
			}
			if(flag){
				int temp=arr[((int)(size/2))+m];
				arr[((int)(size/2))+m]=min;
				arr[n]=temp;
				m++;
				flag=false;
			}
			else{
				int temp=arr[((int)(size/2))+k];
				arr[((int)(size/2))+k]=min;
				arr[n]=temp;
				k--;
				flag=true;
			}
			data=min;
			//System.out.println("B"+arr[i]);
		}
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}


	}
}
