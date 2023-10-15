class MaxAndMinEle{
	public static void main(String [] args){
                int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
                int count=0;
                int max=Integer.MIN_VALUE; //give minimum value of integer value possible store in it i.e.(-2147483648)
		int min=Integer.MAX_VALUE; //give maxmum  value of integer value possible store in it i.e.( 2147483647 )
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum value in array is: "+max);
		System.out.println("Minimum value in array is: "+min);
	}
}
