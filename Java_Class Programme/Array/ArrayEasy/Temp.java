import java.util.*;
class Q27DuplicateInArray{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter Array size: ");
                int size=sc.nextInt();
                System.out.println("Enter fisrt Array: ");
                int arr[] = new int[size];
                int n=1;
                int N=1;
                int j=0;
                int k=0;
                for(int i=1;i<=N;i++){
                    if(i==N-n+1)
                        arr[j]=sc.nextInt();
                    /*
                    if(arr[j]==arr[k]){
                        arr[k]=0;
                    }
                    if(arr[j]<arr[k]){
                        int temp=arr[j];
                        arr[j]=arr[k];
                        arr[k]=temp;
                    }
                    */
                    if(i==N){
                        if(n==size){
                            break;
                        }
                        n++;
                        N=N+n;
                        
                        j++;
                        k=-1;
                    }
                     k++;   
                }
                System.out.println("output: ");
                for(int i=0;i<arr.length;i++){
                        if(arr[i]!=0)
                                System.out.println(arr[i]+" ");
                }
        }
}

