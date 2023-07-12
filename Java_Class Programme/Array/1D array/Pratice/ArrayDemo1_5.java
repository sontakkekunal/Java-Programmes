import java.io.*;
class ArrayDemo1_5{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of element in array");
		int num=Integer.parseInt(br.readLine());
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			System.out.println("Enter "+(i+1)+" number of array ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Output is");
		for(int i=0;i<5;i++){
			System.out.println((i+1)+" number of array is  "+ arr[i]);
		}
	}
}
