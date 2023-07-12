//WAP to print count of digits in elements of array.
//Input:Enter array element : 02 255 2 1554
//Output: 2 3 1 4
import java.io.*;
class ArrayDigitCount{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of the array ");
		int size=Integer.parseInt(br.readLine());
		int arr[] =new int[size];
		System.out.println("Enter array element ");
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<size;i++){
			int temp=arr[i];
			int count=0;
			while(temp!=0){
				count++;
				temp=temp/10;
			}
			System.out.print(count+" ");
		}
	}
}

