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
                int count=0;
                for(int i=0;i<N;i++){
                        for(int j=i;j>=0;j--){//for(int j=0;j>=0;j--) , instization j=0 also give same output , but extra interation 
					      //happens 
					      //give same output because inner conidition (dry run both for better understanding)
                                count++;
                        }
                }
                System.out.println("No. of sub array are: "+count);
        }
}

