class IntegerCache1{
	void dun(int [] arr){
		arr[1]=70;
		arr[2]=80;
	}
	public static void main(String [] args){
		int arr[]={10,20,30,40,50};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));
		System.out.println(System.identityHashCode(arr[4]));
		IntegerCache1 obj = new IntegerCache1();
		obj.dun(arr);
		for(int x: arr){
			System.out.println(x);
		}
		int x=70;
		int y=80;
		System.out.println(System.identityHashCode(x)+"  "+System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(y)+"  "+System.identityHashCode(arr[2]));
	}
}
