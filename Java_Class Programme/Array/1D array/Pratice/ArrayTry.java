class ArrayTry{
	public static void main(String [] args){
		int arr1[]={10,20,30};
		int arr2[]={10,20,30};
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(arr2));

		System.out.println(System.identityHashCode(arr1[0]));
		System.out.println(System.identityHashCode(arr2[0]));

		System.out.println(System.identityHashCode(arr1[1]));
                System.out.println(System.identityHashCode(arr2[1]));

		int arr3[]={200,-300};
		int arr4[]={200,-300};

		System.out.println(System.identityHashCode(arr3[0]));
                System.out.println(System.identityHashCode(arr4[0]));

		char arr5[]={'A','B'};
		char arr6[]={'A','B'};

		System.out.println(System.identityHashCode(arr5));
                System.out.println(System.identityHashCode(arr6));


		System.out.println(System.identityHashCode(arr5[0]));
                System.out.println(System.identityHashCode(arr6[0]));

		float arr7[]={10,20};
		float arr8[]={10,20};

		System.out.println(System.identityHashCode(arr7[0]));
                System.out.println(System.identityHashCode(arr8[0]));


	}
}

