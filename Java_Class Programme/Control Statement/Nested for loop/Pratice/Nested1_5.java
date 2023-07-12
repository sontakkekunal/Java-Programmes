//Write a program to print the following pattern
//A 1 B 2
//C 3 D 5
//E 5 F 6
class Nested1_5{
	public static void main(String [] args){
		int n=1;
		char ch='A';
		for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0)
					System.out.print(n++ +" ");
				else
					System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}

