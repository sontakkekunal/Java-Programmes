//This programme can print or run  3D Jagged as well as normal 3D array in single for loop.
//Note:-The rows or coloums can be differed by plane to plane
//Note:-this progarmme can work on 3D Jagged Array as well as normal array
class SingleForFor3DArray{
	public static void main(String [] args){
		int arr[][][]={{{1,2,3,4},{5,6,7}},{{8,9},{10,11,12}}};
		int len=arr.length;
		int change=arr[0][0].length;
		int plane=0;
		int row=0;
		for(int i=0;i<change;i++){
			if(row==arr[plane].length){
				row=0;
				i=0;
				plane++;
			        if(plane!=len){
		         		change=arr[plane][row].length;
				}
				System.out.println("\n");
			}
			 if(plane==len){
                                break;
                        }
			System.out.print(arr[plane][row][i]+" ");
			if(i==(change-1)){
				i=-1;
				row++;
				if(row!=arr[plane].length){
			        	change=arr[plane][row].length;
				}
				System.out.println();
			}
		}
	}
}


