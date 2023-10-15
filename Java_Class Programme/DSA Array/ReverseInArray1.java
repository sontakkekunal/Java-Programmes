//reverse array with TC=O(N) & SC=O(N)
class ReverseArray1{
	public static void main(String [] args){
		int arr[]={3,5,2,1,-3,7,8,15,6,13};
                int N=arr.length;
		int[] arr1= new int[N];
		int j=0;
		System.out.println("Output: ");
		for(int i=N-1;i>=0;i--){
			arr1[j]=arr[i];
			System.out.print(arr1[j]+"  ");
			j++;
		}
	}
}
