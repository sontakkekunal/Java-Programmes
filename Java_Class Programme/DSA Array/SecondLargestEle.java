
class SecondLargestEle{
        public static void main(String [] args){
                int arr[]={8,4,1,3,9,2,6,7};
                int N=arr.length;
		int max=Integer.MIN_VALUE;
		int max1=0;
		for(int i=0;i<N;i++){
			if(arr[i]>max){
				max1=max;
				max=arr[i];
			}
		}
		System.out.println("Output:	"+max1);
			
        }
}

