//write program to create below star structure using nested for loop
//* * * * *
//* * * *
//* * *
//* *
//*
class NestedForForStar{
	public static void main(String [] star){
		int N=5;
		for(int i=N;i>0;i--){
			for(int j=i;j>=1;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

