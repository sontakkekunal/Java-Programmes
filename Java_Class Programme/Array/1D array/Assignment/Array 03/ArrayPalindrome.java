//WAP to find a palindrome number from an array an array and return its index.
//Take size and elements from the user
//Input: 10 25 252 36 564
//Output: Palindrome Numbr 252 found at index 2
import java.util.Scanner;
class ArrayPalindrome{
	static int Palindrome(int num){
		int value=0;
		while(num!=0){
			int temp=num%10;
			value=value*10+temp;
			num=num/10;
		}
		return value;
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
			int value=Palindrome(arr[i]);
			if(value==arr[i])
				System.out.println("Palindrome number "+arr[i]+" found at index "+i);
			else
				continue;
		}
	}
}
