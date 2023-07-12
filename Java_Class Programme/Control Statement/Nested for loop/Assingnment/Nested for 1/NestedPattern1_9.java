////Write a program to print the following pattern
//C B A
//C B A
//C B A
class NestedPattern1_7{
	public static void main(String [] args){
		for(int i=1;i<=3;i++){
			char ch='C';
			for(int j=1;j<=3;j++){
				System.out.print((ch--)+" ");
			}
			System.out.println();
		}
	}
}
