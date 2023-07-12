//This progarmme can print or run 2d Jagged array in Single for loop
//Note:-coloums may be different or same for each row
//Note:-this programme can works 2D Jagged as well as 2D normal array
class SingleForFor2DArr{
    public static void main(String [] args){
        int arr[][]= new int[][]{{1,3},{4,5,6}};
        int m=arr[0].length;
        int n=0;
        int count=0;
        for(int i=0;i<m;i++){
            System.out.print(arr[n][i]+" ");
            if(i==(m-1)){
                i=-1;
                m=arr[1].length;
                n=1;
                count++;
                System.out.println();
            }
            if(count==2){
                break;
            }
        }
    }
}
