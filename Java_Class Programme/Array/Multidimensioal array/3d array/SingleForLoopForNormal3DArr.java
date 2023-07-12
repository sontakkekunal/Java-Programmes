//this programme can print or run 3d array in single for loop
//Note:- The number of rows and coloums must be same for each plane
//Note:- This programme works on only normal 3D array
class SingleForFor3DArray{
	public static void main(String [] args){
		int arr[][][]={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
		int len1=arr.length;
		int len2=arr[0].length;
		int m=arr[0][0].length;
		int st1=0;
		int st2=0;
		int count=0;
		int count1=0;
		for(int i=0;i<m;i++){
			if((len1*len2*arr[0][0].length)==count1){
				break;
			}
			if(count==arr[st1].length){
				i=0;
				count=0;
				st2=0;
				st1++;
				m=arr[st1][st2].length;
				System.out.println("\n");
			}
			System.out.print(arr[st1][st2][i]+" ");
			count1++;
			if(i==(m-1)){
				if((arr[st1].length-1)!=count)
					st2++;
				i=-1;
				m=arr[st1][st2].length;
				count++;
				System.out.println();
			}
		}
	}
}

