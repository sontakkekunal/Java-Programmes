import java.util.Scanner;
class DigonalForAllMatrix{
        public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter no. of rows in the array: ");
                int row=sc.nextInt();
                System.out.println("Enter no. of coloumns in the array: ");
                int coloumns=sc.nextInt();
                System.out.println("Enter array: ");
                int arr[][]= new int[row][coloumns];
                for(int i=0;i<arr.length;i++){
                        System.out.println("Enter "+(1+i)+" rows elements: ");
                        for(int j=0;j<arr[i].length;j++){
                                arr[i][j]=sc.nextInt();
                        }
                }
                System.out.println("Output: ");
		int n=0;
		if((coloumns-row)>=0){
			n=row;
		}
		else
			n=coloumns;

		int i=0;
		int j=coloumns-1;
		int co=coloumns-1;
		for(int c=0;c<(row*coloumns)-coloumns;c++){
			if(i==n){
				i=0;
				j=co-1;
				co--;
				if(co-row+1>=0){
                       			 n=row;
               			 }
                		else
                        		n=co;

				System.out.println();
				//System.out.println("co: "+co+" i: "+i+" j: "+j+" n: "+n);
			}
			System.out.print(arr[i][j]+"  ");
			i++;
			j--;
		}
	}
}
