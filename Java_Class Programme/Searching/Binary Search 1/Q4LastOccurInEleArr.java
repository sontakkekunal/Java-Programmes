/*
 Q 4. Last Occurrence of an Element
modify the binary search function to find the last occurrence of a given element in
a sorted array.
For instance, given the input array arr = [2, 4, 4, 4, 6, 7, 8] and the target element 4,
the function should return 3, as 4 last appears at index 3 in the array.
*/
import java.util.Scanner;
class Q4LastOccInBinarySearch{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int size=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[] = new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter element to find its last occrance; ");
                int search=sc.nextInt();
                int start=0;
                int end=arr.length-1;
                int val=-1;
                while(start<=end){
                        int mid=(start+end)/2;
                        if(arr[mid]==search)
                                val=mid;
                        if(arr[mid]>search)
                                end=mid-1;
                        if(arr[mid]<=search)
                                start=mid+1;
                }
                System.out.println("Last occurance of "+search+" found at index: "+val);

        }
}

