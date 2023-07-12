class NullPointerDemo{
	public static void main(String [] args){
		int arr1[][]={{},{},{}};
		int arr2[][]=new int[3][];

		System.out.println("first array length "+arr1.length);
		System.out.println("first array coloums length "+arr1[0].length);
		System.out.println("first array sub array loctaion "+arr1[0]);

		System.out.println("second array Sub array loctaion : "+arr2[0]);
		System.out.println("secong array length "+arr2.length);
		System.out.println("secong array coloums length "+arr2[0].length);
	}
}
