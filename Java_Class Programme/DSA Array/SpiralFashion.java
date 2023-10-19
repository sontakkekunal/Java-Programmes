import java.util.Scanner;
class SpiralFashion{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array rows: ");
		int row=sc.nextInt();
		System.out.println("Enter array coloumn: ");
		int coloums=sc.nextInt();
		int arr[][]= new int[row][coloums];
		System.out.println("Enter array: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Output: ");
		int N=arr.length-1;
		int s=1;
		boolean flag=true;
		int i=0;
		int j=0;
		for(int n=1;n<=((arr.length*arr.length)+1)/2;n++){
			for(int m=0;m<N;m++){
				System.out.print(arr[i][j]+"  ");
				if(true){
					if(n%2==1){
						if(flag)
							j++;
						else
							j--;
					}
					else{
						if(flag)
							i++;
						else
							i--;
					}
				}
			}
			if(n==4*s){
				N=N-2;
				s++;
				i++;
				j++;
				//System.out.println("Sta "+i+" "+j);
				
			}
			if(n%2==0){
				if(flag)
					flag=false;
				else
					flag=true;
			}
		}
		if(row%2==1)
			System.out.println(arr[row/2][coloums/2]);
	}
}
