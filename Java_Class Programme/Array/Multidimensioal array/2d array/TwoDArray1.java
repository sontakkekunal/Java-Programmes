import java.io.*;
class TwoDArray1{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows in array ");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter coloums in array ");
		int coloumn=Integer.parseInt(br.readLine());
		int arr[][]=new int[row][coloumn];
		for(int i=0;i<row;i++){
			for(int j=0;j<coloumn;j++){
				System.out.println("Enter elements for rows "+i+" and coloumn "+j+" : "); 
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<row;i++){
                        for(int j=0;j<coloumn;j++){
                                System.out.print(arr[i][j]+" ");
                        }
			System.out.println();
                }
	}
}




