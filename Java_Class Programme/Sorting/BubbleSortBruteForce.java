import java.util.Scanner;
class BubbleSortBruteForce{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arrray size: ");
		int size=sc.nextInt();
		System.out.println("Enter array: ");
		int []arr= new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){ //manged condition dur to inner condition of if, but it give extra iteration
							 //of inner for loop ,even thought further array is sorted
							 //here, it sorted array from last
				if(arr[j]>arr[j+1]){ //side by side swaping of elements
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("O/p:-->");
		for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+"  ");
                }
	}
}
