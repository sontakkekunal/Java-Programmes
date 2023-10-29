//count sub array of length k.
import java.util.Scanner;
class CountSubArrOfLenK{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter array size: ");
                int N=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[]= new int[N];
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.println("Enter K : ");
                int k=sc.nextInt();
                int count=0;
		k=k-1;
                for(int i=0;i<N;i++){
                        if(i+k<N)
                                count++;
                        else
                                break;
                }
                System.out.println("Output: "+count);
        }
}

