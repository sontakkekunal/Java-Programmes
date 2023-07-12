//Write a program to print the following pattern
//12 12 12
//11 11 11
//10 10 10
class NestedPattern1_5{
	public static void main(String [] args){
		for(int i=3;i>0;i--){
			for(int j=1;j<4;j++){
				System.out.print((i+9)+" ");
			}
			System.out.print("\n");
		}
	}
}
