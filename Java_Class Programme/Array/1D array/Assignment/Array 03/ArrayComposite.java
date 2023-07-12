//Wap a find a composite number from an array and return its index.Take size and elemnt from the user
//Inpur: 1 2 3 4 5 6 7
//Output: Composite 6 found at index 4
import java.util.Scanner;
class ArrayComposite{
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
			int count=0;
			for(int j=1;j<=arr[i];j++){
				if((arr[i])%j==0){
					count++;
				}
			}
			if(count>2)
				System.out.println("Composite "+arr[i]+" found at index "+i);
		}
	}
}
				

