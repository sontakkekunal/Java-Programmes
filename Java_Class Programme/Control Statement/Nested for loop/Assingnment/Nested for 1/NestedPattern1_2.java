//Write a program to print the following pattern
//4 5 6 7
//4 5 6 7
//4 5 6 7
//4 5 6 7
class NestedPattern1_2{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print((j+3)+" ");
			}
			System.out.println();
		}
	}
}


