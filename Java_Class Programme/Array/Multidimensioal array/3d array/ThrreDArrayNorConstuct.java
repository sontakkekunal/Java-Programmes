import java.util.Scanner;
class ThrreDArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of planes in 3d array ");
		int planes=sc.nextInt();
		System.out.println("Enter no. of rows in 3d array ");
		int rows=sc.nextInt();
		System.out.println("Enter no. of coloums in 3d array");
		int  coloumn=sc.nextInt();
		int arr[][][]=new int[planes][rows][coloumn];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					System.out.println("Enter "+(i+1)+" plane ,"+(j+1)+" row ,"+(k+1)+" Coloums element in array: ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					System.out.print(arr[i][j][k]+"  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	
	}
}

