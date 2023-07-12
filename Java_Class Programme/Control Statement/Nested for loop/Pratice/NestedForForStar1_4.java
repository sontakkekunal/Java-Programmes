//write program to create below star structure using nested for loop
//* * * *
//  * * *
//    * *
//      *
class NestedForFor1_4{
	public static void main(String [] args){
		int N=4;
		for(int i=N;i>0;i--){
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



