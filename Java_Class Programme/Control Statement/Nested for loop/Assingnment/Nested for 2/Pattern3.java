//write a progarm to print the following pattern
//14 15 16 17
//15 16 17 18
//16 17 18 19
//17 18 19 20
//USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=4;i++){
//    for(int j=1;j<=4;j++){
//         }
//   }
class Pattern2{
	public static void main(String [] args){
		int num=14;
		for(int i=1;i<=4;i++){
			int temp=num;
			for(int j=1;j<=4;j++){
				System.out.print((temp--)+" ");
			}
			num++;
			System.out.println();
		}
	}
}


