import java.io.*;
class ArrayEvenOdd{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of the array");
		int size=Integer.parseInt(br.readLine());
		System.out.println("Enter array uptill "+size);
		int arr[] = new int[size];
		int EvenCount=0;
		int OddCount=0;
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				EvenCount++;
			}
			else
				OddCount++;

		}
		System.out.println("Number of even digit in array is "+EvenCount);
		System.out.println("Number of Odd digit in array is "+OddCount);
	}
}

