//Write a program to print the following pattern
//9 8 7
//9 8 7
//9 8 7
class NestedPattern1_6{
	public static void main(String [] args){
		for(int i=1;i<=3;i++){
			int n=8;
			for(int j=1;j<=3;j++){
				System.out.print((j+n)+" ");
				n=n-2;
			}
			System.out.print("\n");
		}
	}
}
