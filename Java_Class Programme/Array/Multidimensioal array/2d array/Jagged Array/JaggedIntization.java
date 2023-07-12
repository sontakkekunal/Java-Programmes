class JaggedIntization{
	public static void main(String [] args){
		int arr1[][]={{1,2,3},{4,5},{6}};
		//object of sub 1d array is made internallly
		int arr2[][]=new int[3][];
		arr2[0]=new int[]{1,2,3};
		arr2[1]=new int[]{4,5};
		arr2[2]=new int[]{6};
		//object of sub 1d array is made manully 
		for(int []x: arr2){
		       for(int y:x){
		               System.out.print(y+" ");

		       }
                     	System.out.println();
		}
	}
}	
