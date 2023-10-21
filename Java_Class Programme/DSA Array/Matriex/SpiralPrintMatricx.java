import java.util.Scanner;
class SpiralPrintMatrix{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter no. of rows in the array: ");
                int row=sc.nextInt();
                System.out.println("Enter no. of coloumns in the array: ");
                int coloumns=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[][]= new int[row][coloumns];
                for(int i=0;i<arr.length;i++){
                        System.out.println("Enter "+(1+i)+" rows elements: ");
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
		System.out.println("Output: ");
		int N=arr.length-1;
		int i=0;
		int j=0;
		while(N>0){//if position tajen then (N>1) , dry run for better understanding
			for(int x=0;x<N;x++){
				System.out.print(arr[i][j]+"  ");
				j++;
			}
			System.out.println();
			for(int x=0;x<N;x++){
                                System.out.print(arr[i][j]+"  ");
                                i++;
                        }
			System.out.println();
			for(int x=0;x<N;x++){
                                System.out.print(arr[i][j]+"  ");
                                j--;
                        }
			System.out.println();
			for(int x=0;x<N;x++){
                                System.out.print(arr[i][j]+"  ");
                                i--;
                        }
			System.out.println();
			N=N-2;
			i++;
			j++;
		}
		if(arr.length%2==1)  //center element remain in odd size sqr arr
			System.out.println(arr[i][j]+"  ");

		else
			System.out.println();
	}
}
