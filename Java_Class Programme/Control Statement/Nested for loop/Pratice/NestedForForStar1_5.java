//write program to create below star structure using nested for loop
//*
//* *
//* * *
//* * * *
class NestedForFor1_5{
	public static void main(String [] args){
		int N=4;
		for(int i=N;i>0;i--){
			for(int j=0;j<=N-i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

