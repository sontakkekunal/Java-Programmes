import java.util.Scanner;
class ArrayDemo1_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter "+(i+1)+" number of array ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Output is");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+" number of array is  "+ arr[i]);
		}
	}
}


