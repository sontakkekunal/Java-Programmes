//write a progarm to print the following pattern
//1C3   4B2 9A1
//16C3  25B2 36A1
//49C3  64B2 81A1
////USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=3;i++){
//    for(int j=1;j<=3;j++){
//         }
class Pattern9{
	public static void main(String [] args){
		int num=1;
		for(int i=1;i<=3;i++){
			int n=3;
			char ch='C';
			for(int j=1;j<=3;j++){
				System.out.print((num*num)+""+(ch--)+""+(n--)+" ");
				num++;
			}
			System.out.println();
		}
	}
}
