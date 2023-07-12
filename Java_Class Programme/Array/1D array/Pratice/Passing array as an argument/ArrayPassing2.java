class ArrayPassing{
	static void fun(int xarr[]){
		System.out.println("Address of array in fun "+xarr);
	}

	public static void main(String [] args){
		int arr[]={10,20,30};
		System.out.println("Addres of array in main "+arr);
		fun(arr);
	}
}
