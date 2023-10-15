//Reverse of array with TC=O(N) & SC=O(1)
class ReverseArray2{
        public static void main(String [] args){
                int arr[]={8,4,1,3,9,2,6,7};
                int N=arr.length;
                int j=arr.length-1;
		int i=0;
                while(i<j){
			arr[i]=arr[i]^arr[j];
			arr[j]=arr[i]^arr[j];
			arr[i]=arr[i]^arr[j];
			i++;
			j--;
		}
                System.out.println("Output: ");
                for(int a=0;a<N;a++){
                        System.out.println(arr[a]);
                }
        }
}

