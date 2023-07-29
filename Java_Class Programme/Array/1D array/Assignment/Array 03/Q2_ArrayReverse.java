//WAP to reverse each elment in an array
//Take size and elment from the user
//Input: 10 25 252 36 564
//Output: 01 52 252 63 465
import java.util.Scanner;
class ArrayReverse{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter element in the array ");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		ArrayReverse obj = new ArrayReverse();
		System.out.print("Reveersed element in array is ");
		for(int i=0;i<size;i++){
			obj.Reverse(arr[i]);
		}
		System.out.println();
	}
	void Reverse(int num){
		int value=0;
		while(num!=0){
			int temp=num%10;
			value=value*10+temp;
			num=num/10;
		}
		System.out.print(value+" ");
	}
}

