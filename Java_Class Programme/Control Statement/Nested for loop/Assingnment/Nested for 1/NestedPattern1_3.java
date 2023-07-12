//Write a program to print the following pattern
//14 14 14 14
//15 15 15 15
//16 16 16 16
//17 17 17 17
class NetedPattern1_3{
	public static void main(String [] h){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print((i+13)+" ");
			}
			System.out.println();
		}
	}
}

