class ArrayIndexOutOfBoundsExceptionRTE{
	public static void main(String [] args){
		int arr[] = new int[]{10,20,30,40,50};
		System.out.println("Start main");
		for(int i=0;i<=arr.length;i++){ // 0 to 5
			System.out.println(arr[i]);  //Runtime timme exception  5 is not index of array.Current arry has 0 to 4 index
		}
		System.out.println("end main");
	}
}
