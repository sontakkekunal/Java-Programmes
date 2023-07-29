//WAP to find a perfect number from an array and return its index
//take size and element from the user
//Input: 10 25 252 496 564
//Output: Perfect Number 496 found at index 3
import java.util.Scanner;
class ArrayPerfectNum{
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
			boolean value;
			value=Perfect(arr[i]);
			if(value)
				System.out.println("Perfect Number "+arr[i]+" found at index "+i);
			else
				continue;
		}
	}
	static boolean Perfect(int num){
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0)
				sum=sum+i;
			if(sum>num)
				break;
		}
		if(sum==num)
			return true;
		else
			return false;
	}
}

