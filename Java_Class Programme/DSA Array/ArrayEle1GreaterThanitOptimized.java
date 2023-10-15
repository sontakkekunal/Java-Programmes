class ArrayEleAtleast1Greater{
	public static void main(String [] args){
		int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
		int count=0;
		int max=Integer.MIN_VALUE; //give minimum value of integer value possible store in it i.e.(-2147483648)
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max)
				count++;  //count max element beacuse no element is greater than max elements 
		}
		int ans=arr.length-count;//and substracting count of max from total count
		System.out.println("Ouptut: "+ans);
	}
}
