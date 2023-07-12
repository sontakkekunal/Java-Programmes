//Write a program to print the following pattern
//A 1 A 1
//A 1 A 1
//A 1 A 1
class Nested1_3{
	public static void main(String [] args){
		for(int i=1;i<=3;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0)
					System.out.print(1+" ");
				else
					System.out.print("A ");
			}
			System.out.println();
		}
	}
}

