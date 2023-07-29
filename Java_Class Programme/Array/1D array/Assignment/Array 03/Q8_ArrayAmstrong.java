//Wap a find a composite number from an array and return its index.Take size and elemnt from the user
//Input:10 25 252 36 153 55 89
//Output:ArmStrong no 153 found at index 4
import java.util.Scanner;
class ArrayAmstrong{
	int Amstrong(int num){
		int temp=num;
		int count=0;
		while(temp!=0){
			count++;
			temp=temp/10;
		}
		int sum=0;
		while(num!=0){
			int product=1;
			int temp1=num%10;
			for(int i=1;i<=count;i++){
				product=product*temp1;
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
		ArrayAmstrong obj =new ArrayAmstrong();
		for(int i=0;i<size;i++){
			int value=obj.Amstrong(arr[i]);
			if(value==arr[i])
				System.out.println("Amstrong number "+arr[i]+" found at index "+i);
			else
				continue;
		}
	}
}

