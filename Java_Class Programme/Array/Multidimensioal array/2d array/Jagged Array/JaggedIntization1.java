import java.io.*;
class JaggedIntization1{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows in jagged array : ");
		int rows=Integer.parseInt(br.readLine());
		int arr[][]=new int[rows][];
		for(int i=0;i<rows;i++){
			System.out.println("Enter number of elements in "+(i+1)+" rows : ");
			arr[i]=new int[Integer.parseInt(br.readLine())];
		}
		System.out.println("Enter values in 2d array ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter "+(i+1)+" rows and "+(j+1)+" coloums elements ");
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Your entered array is ");
		for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                System.out.print(arr[i][j]+" ");
                        }
			System.out.println();
                }
	}
}






