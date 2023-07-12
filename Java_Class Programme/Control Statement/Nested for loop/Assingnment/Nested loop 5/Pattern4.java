//WAP to print all even number in reverse order and odd number in the standard way.Both separately
//Writin a range . Take the start  and end from user
//Input: Enter start number- 2
//       Enter End Number- 9
//Output:
//      8 6 4 2
//      3 5 7 9
import java.io.*;
class Pattern4{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start number- ");
		int start=Integer.parseInt(br.readLine());
		System.out.println("Enter End number- ");
		int end=Integer.parseInt(br.readLine());
		System.out.print("Even in reverse way ");
		for(int i=end;i>=start;i--){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.print("\n Odd in standard way ");
		for(int i=start;i<=end;i++){
			if(i%2==1)
				System.out.print(i+" ");
		}
	}
}

