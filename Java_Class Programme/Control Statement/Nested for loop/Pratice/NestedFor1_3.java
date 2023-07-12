//write program to create below  structure using nested for loop
//1 1 1
//2 2 2
//3 3 3
class NestedFor3{
	public static void main(String [] argd){
		int N=3;
		int a=1;
		for(int i=N;i>0;i--){
			for(int j=N;j>0;j--){
				System.out.print(a+" ");
			}
			a++;
			System.out.println();
		}
	}
}

