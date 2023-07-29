//WAP to find a strong number from an array and return its index.
//Take size and elements from the user
//Input: 10 25 252 36 564 145
//Output: Strong no 145 found at index 5
import java.util.Scanner;
class ArrayStrong{
	static int Strong(int num){
		int sum=0;
		while(num!=0){
			int product=1;
			int temp=num%10;
			while(temp!=0){
				product=product*temp;
				temp--;
			}
			sum=sum+product;
			num=num/10;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			int value=Strong(arr[i]);
			if(value==arr[i])
				System.out.print("Strong no "+arr[i]+" found at index "+i);

			else
				continue;
			System.out.println();
		}
	}
}
