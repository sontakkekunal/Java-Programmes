//write a progarm to print the following pattern
//A b C d
//E f G h
//I j K i
//M n O p
////USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=4;i++){
//    for(int j=1;j<=4;j++){
//         }
//   }
class Pattern8{
	public static void main(String [] args){
		char ch1='A',ch2='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print((ch1++)+" ");
					ch2++;
				}
				else{
					System.out.print((ch2++)+" ");
					ch1++;
				}
			}
			System.out.println();
		}
	}
}


