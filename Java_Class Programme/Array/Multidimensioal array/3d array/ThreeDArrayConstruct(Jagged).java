import java.util.Scanner;
class ThrreDArray2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of planes in 3d array ");
		int planes=sc.nextInt();
		int arr[][][]=new int[planes][][];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter no. of rows in "+(i+1)+" plane : ");
			arr[i]=new int[sc.nextInt()][];
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter no. of coloums in "+(i+1)+" plane and "+(j+1)+" row : ");
				arr[i][j]=new int[sc.nextInt()];
			}
		}
		System.out.println("Enter elenments in 3d array: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				for(int k=0;k<arr[i][j].length;k++){
					System.out.println("Enter element for  "+(i+1)+" planes , "+(j+1)+" row and "+(k+1)+" column : ");
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		System.out.println("Three D array is : -  ");
		for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                for(int k=0;k<arr[i][j].length;k++){
                                        System.out.print(arr[i][j][k]+" ");
                                }
				System.out.println();
                        }
			System.out.println("\n");
                }

	}
}

			

