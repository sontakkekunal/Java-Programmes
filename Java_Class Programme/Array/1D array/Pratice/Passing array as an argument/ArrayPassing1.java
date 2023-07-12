class ArrayPass1{
	public static void main(String [] args){
		int arr[]={50,100,150};
		fun(arr);
		for(int x: arr){
			System.out.print(x+" ");
		}

	}
	static void fun(int arr[]){
		for(int x: arr){
			System.out.print(x+" ");
		}
		System.out.println();
		int count=0;
		for(int x: arr){
			arr[count]=arr[count]+50;
		        count++;
		}
	}
}
