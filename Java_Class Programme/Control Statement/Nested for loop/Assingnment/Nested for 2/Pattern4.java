//write a progarm to print the following pattern
// 1A 2B 3C
// 1A 2B 3C
// 1A 2B 3C
// USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=3;i++){
//    for(int j=1;j<=3;j++){
//         }
//   }
class Pattern4{
	public static void main(String [] args){
		for(int i=1; i<=3;i++){
			int n=1;
			char ch='A';
			for(int j=1;j<=3;j++){
				System.out.print((n++)+""+(ch++)+" ");
			}
			System.out.println();
		}
	}
}

