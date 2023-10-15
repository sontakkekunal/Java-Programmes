/*
 Give an array of size N
 Return the count of pair(i,j) with
 Arr[i]+Arr[j]==K
Arr:[3,5,2,1,-3,7,8,15,6,13]
N: 10
K: 10
Output: 6
*/
class ArrayPairWithSumK{
        public static void main(String [] args){
                int arr[]={3,5,2,1,-3,7,8,15,6,13};
                int N=arr.length;
                int K=10;
                int count=0;
                for(int i=0;i<N;i++){
                        for(int j=0;j<i;j++){
                                if(arr[i]+arr[j]==K)
                                        count++;
                        }
                }
                //the count will return one to one format pair and not inverse of that pair, so make mutipleby 2
                System.out.println("Output: "+(count*2));
        }
}

