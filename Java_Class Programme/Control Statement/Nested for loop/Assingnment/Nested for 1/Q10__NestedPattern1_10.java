//Write a program to print the following pattern
//1 2 3 4
//2 3 4 5
//3 4 5 6
//4 5 6 7
class NestedPattern1_10{
	public static void main(String [] arfs){
		int n=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print((j+n)+" ");
			}
			n++;
			System.out.println();
		}
	}
}

