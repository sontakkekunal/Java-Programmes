class FisrtAndLastSumCon{
        public static void main(String [] args){
                int arr[]={8,4,1,3,9,2,6};
                int N=arr.length;
		int j=1;
		for(int i=0;i<N/2;i++){
			System.out.println(arr[i]+arr[N-j]);
			j++;
		}
	}
}
