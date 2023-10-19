//Given a square matrics , print right  diognal
import java.util.Scanner;
class MatricsArr{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter rows: ");
                int row=sc.nextInt();
                System.out.println("Enter coloumns: ");
                int coloum=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[][]= new int[row][coloum];
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Output: ");
		int j=arr[0].length-1;
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i][j]);
			j--;
                }
        }
}

