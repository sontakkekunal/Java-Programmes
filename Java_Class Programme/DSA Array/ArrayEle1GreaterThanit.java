/*
 Q2. Give an integer array of size N count the no. elements having atleast 1 element greater than itself.
arr:[2,5,1,4,8,0,8,1,3,8]
N:10
ouput: 7;
*/
class ArrayAtleast1Greater{
	public static void main(String [] args){
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};
		int count=0;
		for(int i=0;i<arr.length;i++){
			boolean flag1=false;
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					flag1=true;
					break;
				}
			}
			if(flag1)
				count++;
		}
		System.out.println("Output: "+count);
	}
}
 
