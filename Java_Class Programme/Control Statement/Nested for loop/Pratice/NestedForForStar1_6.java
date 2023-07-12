//write program to create below star structure using nested for loop
//      *
//    * *
//  * * *
//* * * *
class NestedForFor1_6{
	public static void main(String [] args){
		int N=4;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=(N-i)*2;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

