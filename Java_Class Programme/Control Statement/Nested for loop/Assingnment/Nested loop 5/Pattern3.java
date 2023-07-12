//write a progarm to print the following pattern
//5 4 3 2 1
//8 6 4 2
//9 6 3
//8 4
//5
//Use this loop strictly for the outer loop
//int row;
//Take the number of rows from user
//for(int i=1;i<=row;i++){
//}
import java.io.*;
class Pattern3{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows ");
		int row=Integer.parseInt(br.readLine());
		int row2=row;
		for(int i=1;i<=row;i++){
			int temp=row2*i;
			for(int j=1;j<=(row-i+1);j++){
				System.out.print(temp+" ");
				temp=temp-i;
			}
			row2--;
			System.out.println();
		}
	}
}


