//wAP to reverse each element in an array
//Take size and element from the user
//Input:10 25 252 36 564 
//Output: 01 52 252 63 465
import java.util.Scanner;
class ArrayElementReverse{
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
			int temp=arr[i];
			int value=0;
			while(temp!=0){
				int temp1=temp%10;
				value=value*10+temp1;
				temp=temp/10;
			}
			System.out.print(value+" ");
		}
	}
}
