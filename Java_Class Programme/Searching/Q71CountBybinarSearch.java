/*
 Q 7.
Given a sorted binary array consisting of only 0s and 1s, write a program to count
the number of 1s in the array using binary search.
For example, given the input array arr = [0, 0, 1, 1, 1, 1, 1], the function should
return 5 as there are five occurrences of the digit 1 in the array.
*/
import java.util.Scanner;
class Q41CountsByBinarySerach{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to find its first occrance; ");
		int search=sc.nextInt();
		int start=0;
		int end=arr.length-1;
		int count=0;
		boolean flag=true;
		/*
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==search){
				count++;
			}
			System.out.println(start+"  "+end+"  "+mid);
			if(arr[mid]>=search && flag){
				end=mid-1;
				if(arr[((start+end)/2)]<search){
					flag=false;
					start=0;
					end=arr.length-1;
					count--;
				}
			}

			else if(arr[mid]<=search)
				start=mid+1;
		}
		*/
		boolean flag1=false;
		while(start<=end){
			int mid=(start+end)/2;
			if(mid>=arr.length)
				break;
                        if(arr[mid]==search){
                                count++;
				flag1=true;
				start++;
				end++;
				if(arr[mid]!=search)
					break;
                        }
			else if(flag1 && arr[mid]!=search)
				break;
			if(flag1)
				continue;
			if(arr[mid]>search)
				end=mid-1;
			if(arr[mid]<search)
				start=mid+1;
		}
		start=0;
               	end=arr.length-1;
		count--;
		flag1=false;
		while(start<=end){
                        int mid=(start+end)/2;
                        if(mid<0)
                                break;
                        if(arr[mid]==search){
                                count++;
                                flag1=true;
                                start--;
                                end--;
                                if(arr[mid]!=search)
                                        break;
                        }
                        else if(flag1 && arr[mid]!=search)
                                break;
			if(flag1)
				continue;
                        if(arr[mid]>search)
                                end=mid-1;
                        if(arr[mid]<=search)
                                start=mid+1;
                }
		System.out.println("Number of "+search+" in arr are: "+count);

	}
}
