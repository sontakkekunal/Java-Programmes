//Reverse of array with TC=O(N) & SC=O(1)
class ReverseArray2{
        public static void main(String [] args){
                int arr[]={8,4,1,3,9,2,6,7};
                int N=arr.length;
		int j=arr.length-1;
		for(int i=0;i<N/2;i++){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		System.out.println("Output: ");
		for(int i=0;i<N;i++){
			System.out.println(arr[i]);
		}
	}
}


