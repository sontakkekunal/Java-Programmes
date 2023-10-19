import java.util.*;
class SubArrayCount{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter number of array: ");
                int N=sc.nextInt();
                int arr[]= new int[N];
                System.out.println("Enter array: ");
                for(int i=0;i<N;i++){
                        arr[i]=sc.nextInt();
                }
                int count=(N*(N+1))/2;
                System.out.println("No. of sub array are: "+count);
        }
}

