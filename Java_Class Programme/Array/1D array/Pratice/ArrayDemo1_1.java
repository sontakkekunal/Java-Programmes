class ArrayDemo1_1{
	public static void main(String [] args){
		int arr[] = new int[4];
		arr[0]=10;
		arr[1]=10;
		arr[2]=10;
		arr[3]=10;
		System.out.println(arr);
		int arr2[]={20,20,20,20};
		int arr3[]= new int[]{30,30,30,30};
		System.out.println(arr2);
		System.out.println(arr3);
//		int arr4[] = new int[4]{40,40,40,40};    ------> error: array creation with both dimension expression and initialization is illegal
//               // give either dimension or list 
	}
}

