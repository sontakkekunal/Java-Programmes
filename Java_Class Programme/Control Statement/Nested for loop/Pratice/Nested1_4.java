//Write a program to print the following pattern
//A 1 B 2
//A 1 B 2
//A 1 B 2
class Nested1_4{
	public static void main(String [] args){
		for(int i=1;i<=3;i++){
			int n=1;
			char ch='A';
			for(int j=1;j<=4;j++){
				if(j%2==0)
					System.out.print(n++  +" ");
				else
					System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}

